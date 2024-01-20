package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac2correct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("배열 크기를 입력해라");
            int size = scanner.nextInt();

            if(size <= 0){
             throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }
//            배열 생성
            int[] array = new int[size];
//            배열 요소 입력
            System.out.println(size+"개의 정수를 입력해라");
            int sum =0;

            for (int i = 0; i < size ; i++) {
                System.out.print("정수 : "+(i+1));
                array[i]= scanner.nextInt();
                sum +=array[i];
            }

//            평균 계산
            double average =(double) sum/ size;
            System.out.println("평균 값 : " +average);

        }catch (InputMismatchException e){
            System.out.println("정수를 입력해라!!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }

    }
}
