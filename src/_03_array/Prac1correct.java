package _03_array;

import java.util.Scanner;

public class Prac1correct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        //new로 만들어줬으니까 초기화가 됐음
        System.out.println("5개의 정수를 입력해");

        for(int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        //평균 계싼
        double sum = 0;
        for(int number : numbers){
            sum +=number;
        }

        double average = sum / numbers.length;
        System.out.println("평균은 " + average);

        scanner.close();
    }
}
