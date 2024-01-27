package _05_java_class._09_collection_set.Prac;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PracAlone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        사용자 입력 중복 방지 위해 :hashSet 사용
//        hashSet은 중복된 값은 저장을 안해줌!!
//        hashSet은 순서도 보장x

        Set<Integer> inputOnlyOne = new HashSet<>();

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

        while(true){
            System.out.println("정수 입력 : ");
            int number = scanner.nextInt();
            if(number==-1){
                break;
            }
//            hashSet에 값 저장
            inputOnlyOne.add(number);

        }

//        while문이 끝났을 때 중복 제거된 정수 목록 보여줌
        System.out.println("중복 제거된 정수 목록 : "+inputOnlyOne);
    }
}