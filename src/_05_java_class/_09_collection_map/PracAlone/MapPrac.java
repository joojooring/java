package _05_java_class._09_collection_map.PracAlone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapPrac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        이름과 나이를 key와 컬럼으로 묶는 map 사용
        Map<String, Integer> user = new HashMap<>();

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력시 종료됩니다.");
        while (true){
            System.out.println("이름 입력" );
            String name = sc.nextLine();
            if(name.equals("종료")){
                break;
            }
            System.out.println("나이 입력" );
            int age =sc.nextInt();
            sc.nextLine();

//            이름이 이미 존재하는 경우, 나이를 갱신(덮어쓰기)
            user.put(name,age);
        }
        System.out.println("입력 받은 이름과 나이 목록" );

//        iterator 반복

        Iterator<Map.Entry<String, Integer>> entryIterator = user.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("이름 : "+key+", 나이 : "+ value);
        }



//        entryset() 이용해서 for 문 반복
//        반환되는 값은 set
//        각각의 타입이 entry
//        Set<Map.Entry<String, Integer>> 이거를 반환하는게 entrySet()
        for(Map.Entry<String, Integer> entry : user.entrySet()){
            System.out.println("이름 "+entry.getKey()+", 나이 : "+entry.getValue());
        }

        sc.close();
    }
}
