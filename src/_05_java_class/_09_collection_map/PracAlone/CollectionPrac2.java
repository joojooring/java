package _05_java_class._09_collection_map.PracAlone;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionPrac2 {
    public static void main(String[] args) {

//        키와 값으로 저장할거라 map을 이용해줌
        Map<String, Integer> inputUser = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");

        while (true){
            System.out.println("이름 입력 : ");
            String name = scanner.nextLine();

            if(name.equals("종료")){
                break;
            }

            System.out.println("나이 입력 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

//            map에서는 저장을 put으로 함
            inputUser.put(name,age);

        }
//  while문이 끝나고 저장된 값을 출력
        System.out.println("\n == 입력받은 이름과 나이 목록==");

//        Set<Map.Entry<K, V>> entrySet() : 키와 값을 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
        for(Map.Entry<String, Integer> arr : inputUser.entrySet()){
            System.out.println("이름 : " + arr.getKey());
            System.out.println("나이 : " + arr.getValue());
        }
    }
}
