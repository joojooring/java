package _05_java_class._09_collection_set.Prac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetPracAlone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        중복제거위한 hashSet 생성
        Set<Integer> user = new HashSet<>();

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

        while (true){
            System.out.println("정수 입력 : ");
            int number = sc.nextInt();

            if(number == -1){
                break;
            }
            user.add(number);
        }
        sc.close();
        System.out.println("중복 제거된 정수 목록 : "+user);

    }
}
