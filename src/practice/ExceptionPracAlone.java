package practice;

import java.util.ArrayList;

public class ExceptionPracAlone {
    public static void main(String[] args) {
    int[] array = new int[4];
//    ArrayList<Integer> array = new ArrayList<>();

    try{
        for (int i = 0; i < 4; i++) {
            //                배열 크기를 벗어나는 인덱스에 접근
            array[i] = i;
            System.out.println(array[i]);
        }

        System.out.println(array.length);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("인덱스가 범위를 벗어났습니다.");
    }

}
}
