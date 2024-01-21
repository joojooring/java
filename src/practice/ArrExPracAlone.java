package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrExPracAlone {
    public static void main(String[] args) {

        int[] originArray = {1,2,3};
        int[] newArray = new int[5];

        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
//       Arrays 메소드
//        1-1(배열복사). Arrays.toString(arr) : 배열을 문자열로 변환하여 반환 []안에 값이 들어옴
        System.out.println(Arrays.toString(newArray)); //[1, 2, 3, 0, 0]

//        1-2(배열복사) arraycopy()메소드 사용
//        :System. arraycopy( Object src, int src, Object dest, int destPos, int length);
//        - 첫번째 인자로 들어가는 Object src : 원본배열명
//        - 두번째 인자로 들어가는 int src : 원본배열 복사 시작 인덱스!!
//        - 세번째 인자로 들어가는 Object dest : 새배열
//        - 네번째 인자로 들어가는 int destPos : 새배열 붙여넣기 시작 할 인덱스
//        - 마지막 인자로 들어가는 int length : 복사 항목 수

        String[] originFruits = {"apple", "banana", "kiwi"}; //원본 배열
        String[] newFruits = new String[5]; // 새배열

//        System.arraycopy(originFruits,2,newFruits,2,originFruits.length-2);
        System.arraycopy(originFruits,2,newFruits,4,1);
        System.out.println(Arrays.toString(newFruits));

//        2. Arrays.copyOf(배열, copyArrayLength)
        int[] originalArray = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originalArray,2);
        System.out.println("오리지날 배열 : " + Arrays.toString(originalArray));
        System.out.println("copyOf 배열 : "+Arrays.toString(copiedArray));


//        3. 시작과 끝을 직접 지정하고 싶으면 copyOfRange(배열, 시작index, 끝index -1 )
        int [] rangeArr = Arrays.copyOfRange(originalArray, 3,5);
        System.out.println("range 배열 : "+Arrays.toString(rangeArr));

//        4. fill(배열, 나머지에 채울 값)
        int[] filledArray = new int[5];
        System.out.println("filledArray (before) : "+ Arrays.toString((filledArray)));
        Arrays.fill(filledArray, 888);
        System.out.println("filledArray (after) : "+ Arrays.toString((filledArray)));

//        5. Arrays.sort : 배열의 값들을 정렬해줌
        int [] unsortedArr = {4,2, 88,65,5};
        Arrays.sort(unsortedArr);
        System.out.println("정렬된 배열 : "+ Arrays.toString(unsortedArr));

//        6. Arrays.equals (배열1, 배열2) : 두 배열의 각각의 요소 값이 동일한지 비교해서 true/ false 반환
        int[] array1 = {8,9,7};
        int[] array2 = {8,9,7};
        int[] array3 = {8,1,7};

        boolean arraysEquals = Arrays.equals(array1, array2);
        boolean arrayEqual2 = Arrays.equals(array1,array3);
        System.out.println("배열 값 비교1 : "+ arraysEquals);
        System.out.println("배열 값 비교2 : "+ arrayEqual2);

//        6-2 Arrays.deepEquals (배열1, 배열2) : 다차원 비교시
        int[][] deepArray1 = {{1,2},{3,4}};
        int[][] deepArray2 = {{1,2},{3,4}};
        int[][] deepArray3 = {{5,2},{3,4}};

        boolean deepArraysEquals = Arrays.deepEquals(deepArray1,deepArray2);
        boolean deepArraysEquals2 = Arrays.deepEquals(deepArray1,deepArray3);

        System.out.println("다차원배열 비교시 deepEquals로 : "+deepArraysEquals);
        System.out.println("다차원배열 비교시 deepEquals로2 : "+deepArraysEquals2);


//        7. Arrays.binarySearch(배열, index) : 단, 배열은 정렬된 상태여야됨
//        : 배열의 특정 인덱스 요소값을 이진 검색 알고리즘을 사용하여 검색한 후 , 해당 위치 반환
//                          이진 검색 알고치즘을 사용하므로 매개변수로 전달되는 배열이 sort() 등을 사용하여 미리 정렬되어 있어야됨

        int[] sortedArray = {10,20,55,66,253};
        int index = Arrays.binarySearch(sortedArray, 66);
        System.out.println("이진검색으로 이 값이 몇번째에 있는지 : " + index);
    }
}
