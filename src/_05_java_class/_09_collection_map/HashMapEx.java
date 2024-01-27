package _05_java_class._09_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEx {
    public static void main(String[] args) {
//        key 랑 value가 있음
//  키 id, 값이 name인 HashMap 예제

//        Map 컬렉션 생성
        Map<Integer, String> map = new HashMap<>();

//        객체 저장
        map.put(1001,"홍길동");
        map.put(1002, "성춘향");
        map.put(1003,"김민지");
        map.put(1004,"강해린");

//        전체 객체 수
        int size = map.size();
        System.out.printf("총 %d 명의 학생이 있습니다. %n%n", size);

//  key로 값을 얻을 수 있음 (key value형태이기 때문에) ->키는 중복이 안되므로
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d 번에 해당하는 학생은 %s 입니다. %n%n", key,value);


//        키와 값으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        System.out.println(entrySet); //[1001=홍길동, 1002=성춘향, 1003=김민지, 1004=강해린]

        Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s 학생은 %d번 입니다.%n",v,k);
        }

//        키 값을 가진 Set 컬렉션을 얻고, 반복해서 키와 값을 얻을 수 있음
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);// 키값만 Set 형태로 : [1001, 1002, 1003, 1004]

//        주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제됐습니다.%n", deletedValue);
    }
}
