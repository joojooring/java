package _05_java_class._09_collection_map.PracCorrect;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionEx2 {
    public static void main(String[] args) {
//        이름, 나이 저장할 Map 생성
        Map<String, Integer> nameAgeMap = new HashMap<>();

//        사용자로부터 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. 종료를 입력시 종료됨");

        while (true){
            System.out.println("이름을 입력하세요.");
            String name = scanner.nextLine();

            if(name.equals("종료")){
                break;
            }

            System.out.println("나이 입력하세요.");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기


//            map은 저장시 add가 아니라 put임
//            이름이 이미 존재하는 경우 , 나이를 갱신(덮어쓴다) : 이게 hashmap
            nameAgeMap.put(name,age);
        }
        System.out.println("\n == 입력받은 이름과 나이 목록 ==");

//        entrySet이용해서 출력 - iterator만들어서?해도 됨
//       entrySet이용해서 for문 반복
//        Set<Map.Entry<String, Integer>>
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()){
            System.out.println("이름 : "+entry.getKey());
            System.out.println("나이 : "+entry.getValue());
        }
        scanner.close();

    }
}
