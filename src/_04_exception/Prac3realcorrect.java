package _04_exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac3realcorrect {
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


//            /////////////////////////////////////////////////
            for (int i = 0; i < size ; i++) {
                System.out.print("정수 "+(i+1)+":");
                array[i]= scanner.nextInt();
            }
//            중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(array);

//            중복된 요소 출력
            if(duplicates.isEmpty()){
                System.out.println("중복된 요소가 없습니다.");
            }else{
                System.out.println("중복된 요소 : " + duplicates);
            }

//            /////////////////////////////////////////////////////////////////
        }catch (InputMismatchException e){
            System.out.println("정수를 입력해라!!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }

    }


//    //////////////////////////////////////////////////////////////////
//    중복된 요소를 찾는 메서드
    public static ArrayList<Integer> findDuplicates (int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length -1 ; i++) {
//            왜 이중 for문?? :
//            1,2,3,4,5
//            1에 대해서 2,3,4,5가 중복된 값이 있는지 확인해야되기 때문에 => i=0, j=1~length-1
//            2에 대해서 3,4,5
//            3에 대해서 4,5
//            4에 대해서 5를 검사
//            5는 검사할 대상이 없음 그래서 arr.length -1

            for (int j = i+1; j < arr.length ; j++) {
//                요소값이 1 2 1 1 이라면 몇개가 중복됐는지 다 출력하고 싶으면 이렇게 하면 되고
//              if (arr[i] == arr[j]){
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    //중복된 요소만 알고 싶으면 &&를 걸어서
                    duplicates.add(arr[i]);
//                    -> 다 돌고 나면 duplicates: [1]만 있을거임
                }
            }
        }
         return duplicates;
    }
}
