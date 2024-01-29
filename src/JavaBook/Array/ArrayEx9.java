package JavaBook.Array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1,3,6,11}; //불연속 배열
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
//            System.out.println(tmp);
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));

     }
}
