package _02_controllStatement;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if( age >= 20){
            System.out.println("성인");
        }else if(17 <=  age && age  <=19){
            System.out.println("고등학생");
        }else if(14 <= age && age  <= 16){
            System.out.println("중학생");
        }else if(8 <= age && age  <= 13){
            System.out.println("초등학생");
        }else{
            System.out.println("유아");
        }
        scanner.close();
    }
}
