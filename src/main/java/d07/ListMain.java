package d07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
       // arrayEx();

        ArrayList<Integer> arrayList = new ArrayList<>();
        listEx(arrayList);

        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>();
        listEx(linkedList);

    }

    private static void listEx(List<Integer> list) {
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(5);
        list.add(10);
        System.out.println(list);
        list.set(1,7);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }

    private static void arrayEx() {
        Integer[] intArr = new Integer[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;

        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
