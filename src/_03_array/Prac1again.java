package _03_array;

import java.util.Scanner;

public class Prac1again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");
        int[] numberArray = new int[5];
        int sum = 0;
        for (int i=0; i<5; i++){
            numberArray[i] = scanner.nextInt();
            sum += numberArray[i];
        }

        double average = (double) sum/5;
        System.out.println("평균은 "+average);
    }
}
