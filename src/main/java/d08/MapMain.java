package d08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    // key, value
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // 동일한 키가 있으면 값은 유일하다
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("a", 5);

        System.out.println(map);
        HashMap<String, ArrayList<Integer>> map2 = new HashMap<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        map2.put("a", arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(3);
        arrayList2.add(4);
        map2.put("b", arrayList2);

        System.out.println(map2);

        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("a", 1);
        map3.put("b", 2);
        map3.put("c", 3);

        System.out.println(map3.get("a"));//1
        System.out.println(map3.get("b"));//2
        System.out.println(map3.get("d"));//null
        System.out.println(map3.getOrDefault("c", 0));//3
        System.out.println(map3.getOrDefault("4", 0));//0

        String str = "aabbaccbz";
        HashMap<Character, Integer> map4 = new HashMap<>();
        for (char c : str.toCharArray()) {
            map4.put(c, map4.getOrDefault(c, 0) + 1);


        }
        System.out.println(map4);
        String answer = "";
        for (Map.Entry<Character, Integer> entry : map4.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            answer += value;
            answer += key;
        }
        System.out.println("answer = " + answer);
    }
}

