package _04_exception;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionalPrac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("배열 크기를 입력하세요. : ");
            int array = scanner.nextInt();
            int [] arrayarray = new int[array];

            for (int i = 0; i < array ; i++) {
                try {
                    System.out.println("배열 요소를 입력해라.");
                    arrayarray[i] = scanner.nextInt();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("배열 인덱싱 중 에러 발생 !!" + e.toString());
                }
            }
            int sum=0;
            for(int num: arrayarray) {
                sum += num;
            }

            try {
                double average = (double) sum / array;
                System.out.println("배열의 평균 값 : " + average);
            }  catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없어요." + e.getMessage());
            }
        }catch (InputMismatchException e){
            System.out.println("숫자를 입력하세요. : "+e.getMessage());
            scanner.nextLine();
            main(args);
        }
    }
}
