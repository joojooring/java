package _03_array;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요.");

        int[] numberArray = new int[5];

        for(int i =0 ; i<5; i++){
            numberArray[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i <5; i++){
            sum +=numberArray[i];
        }

        double average = (double) sum / 5;
        System.out.println("평균은 "+ average);

    }
}
