package TIL0519;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Member> map = new HashMap<>();
        LinkedHashMap<Integer, Member> linkedHashMap = new LinkedHashMap<>();
        map.put(0, new Member("홍길동", 30));
        map.put(1, new Member("Buddy", 24));
        map.put(2, new Member("Noin", 25));
        map.put(-1, new Member("pobi", 55));
        map.put(-2, new Member("brown", 30));
//        map.put(7,new Member("cu",30));
//        map.put(-10,new Member("jon",30));
        Set<Map.Entry<Integer, Member>> entrySet = map.entrySet();
        System.out.println(entrySet.toString());

        linkedHashMap.put(0, new Member("홍길동", 30));
        linkedHashMap.put(1, new Member("Buddy", 24));
        linkedHashMap.put(2, new Member("Noin", 25));
        linkedHashMap.put(-1, new Member("pobi", 55));
        linkedHashMap.put(-2, new Member("brown", 30));
        Set<Map.Entry<Integer, Member>> linkedSet = linkedHashMap.entrySet();
        System.out.println(linkedSet.toString());
    }
}
