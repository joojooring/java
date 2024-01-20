package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalPrac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해라");
        int arraysize = scanner.nextInt();
        int[] array = new int[arraysize];

        ArrayList<Integer> repeated = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("배열 요소를 입력해라");
                int element = scanner.nextInt();
//                arraysize[i] = scanner.nextInt();
                if (ifRepeated(array, i, element)) {
                    repeated.add(element);
                }
                array[i] = element;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요." + e.getMessage());
                scanner.nextLine();

            }
        }


        System.out.println("중복된 숫자 배열");
        for (int rep : repeated) {
            System.out.println(rep);
        }

    }

    private static boolean ifRepeated(int[] array, int currentIndex, int element) {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count > 0;
    }
}
