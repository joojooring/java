package _05_java_class._09_collection_set.Prac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetPrac1 {

    public static void main(String[] args) {

        Set<Integer> set1 =new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        int number = scanner.nextInt();
        System.out.println("정수 입력 : "+number);

        while (number != -1){
            set1.add(number);
            number = scanner.nextInt();
            System.out.println("정수 입력 " +number);
        }
        System.out.println("중복 제거된 정수 목록: ");
        for (int num : set1) {
            System.out.println(num);
        }

        System.out.println("===iterator로 제거===");
//        Iterator<>
    }
}
