package _02_controllStatement;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=1; i<11; i++){
            System.out.print(i);
        }
        scanner.close();

    }
}
