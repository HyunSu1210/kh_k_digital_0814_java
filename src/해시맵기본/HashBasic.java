package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashBasic {
    public static <Set> void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // <key, value>
        // 객체 저장
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 96); // 키가 같기 때문에 나중에 저장된 값으로 대치
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println(map.get("동그라미"));
        // 향상된 for문으로 map 순회
        for(String key : map.keySet()) { // keySet() key가 포함된 Set 컬렉션 반환
            System.out.println(key + "\t" +map.get(key));
        }
        // iterator(반복자)를 사용하는 방법
//        Set<String> keySet = map.keySet(); // 모든 키를 Set 객체에 담아서 리턴
//        Iterator<String> iterator = keySet.iterator();

        map.remove("최수연");
    }
}
