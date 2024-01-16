package _01_basic_syntax;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();

//        printf : %s string일 때 %d int일 때
        System.out.printf("안녀아헤숑! %s님, %d 세 이시네요!", name, age);
        System.out.println("안녕하세요! " + name +"님" + "(" + age + "세)");

    }
}
