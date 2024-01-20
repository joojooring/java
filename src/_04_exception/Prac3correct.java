package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac3correct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("배열 크기를 입력해");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println(size + "개의 정수를 입력해라");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            ArrayList<Integer> repeated = repeatedNumber(arr);
            if (repeated.size() > 0) {
                System.out.println("중복된 숫자 서브 배열 : " + repeated);
            } else {
                System.out.println("중복된 숫자가 없습니다.");
            }

        } catch (InputMismatchException e) {
            System.out.println("정수를 입력하세요!!");
        }

    }
    private static ArrayList<Integer> repeatedNumber(int[] arr) {
        ArrayList<Integer> repeated = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isRepeated = false;
            if (!repeated.contains(num)) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == num) {
                        isRepeated = true;
                        break;
                    }
                }
                if (isRepeated) {
                    repeated.add(num);
                }
            }
        }

        return repeated;
    }
}



