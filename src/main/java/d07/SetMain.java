package d07;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        //HashSet, LinkedHashSet, TreeSet;
        //HashSet: 들어온 순서 보장X, 속도 빠름
        //LinkedSet: 들어온 순서 보장O, 속도가 조금 느림
        //TreeSet: 들어온 순서 보장X, 내부적으로 정렬되어있음 -> 출력시 오름차순으로
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        setEx(hashSet);
        setEx(linkedHashSet);
        setEx(treeSet);
    }

    private static void setEx(Set<Integer> set) {
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(10);
        System.out.println(set.contains(10));
        System.out.println(set.contains(40));
        System.out.println(set.size());

        for (int i = 0; i < set.size(); i++) {
            //System.out.println(set[i]);
            //System.out.println(set.get(i));
        }


        for (Integer x : set) {
            System.out.println(x);

        }
    }
}
