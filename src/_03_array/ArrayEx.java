package _03_array;

//표준 배열

//배열
//- 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야 함
//- 배열의 원소는 모두 같은 타입
//// - 처음 선언한 배열 크기 변경 불가능 (단, ArrayList 컬렉션의 경우, 동적으로 크기 조절 가능)
// -

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
//        배열 변수 선언
//        - 선언에는 두가지 방법이 있으나, 관례적으로 첫 번째 방법 사용
//        1. 타입 [] 변수;
//        2. 타입 변수[];
        int[] arr1;
        int arr2[];

//        -배열 변수는 "참조형 변수". 배열도 객체이므로 힙 영역에 생성되고, 배열변수는 힙 영역의 주소를 저장
//        참조형 변수이기때문에 null로 초기화 가능(null 저장 가능)
//        ex. 타입[] 변수 = null;
//        => 배열 변수가 null값을 가진 상태에서는 변수[인덱스]로 값을 읽거나 저장하게 되면 error가 남. error 이름은 NullPointerExeption 발생.(예외의 한 종류)
        String[] temp = null;
        System.out.println(temp); // 출력 : null
//        System.out.println(temp[0]); // 출력시 error 발생 NullPointerException

//        값의 목록으로 배열 변수 선언과 배열 생성
        int[] intArray = {16, 22, 34, 41, 59};
        System.out.println("intArray[0] : " + intArray[0]);
        System.out.println("intArray[1] : " + intArray[1]);
        System.out.println("intArray[2] : " + intArray[2]);
        System.out.println("intArray[4] : " + intArray[4]);
        System.out.println("intArray : " + intArray); // 변수가 가지고 있는 저장된 참조값이 나오게 됨

        //값 변경시
        intArray[1] = 77;
        System.out.println("intArray[1] : " +intArray[1]);

//        주의할 점 : 중괄호{}로 감싼 목록을 배열 변수에 대입할 때, 배열 변수를 미리 선언한 수에는 값 목록을 변수에 대입 불가능 함.
//        char[] charArray;
//        charArray = {"a". "b", "c"}; // 컴파일 에러가 뜨게 됨
//        배열 변수 선언 시점과, 값 목록 대입하는 시점이 다르다면 "new 타입[]"을 중괄호 아ㅠ에 붙여서 대입해줘야 됨

        char[] charArray;
        charArray = new char[] {'a', 'b', 'c'};
        System.out.println("charArray[0] : "+ charArray[0]);
        System.out.println("charArray[2] : "+ charArray[2]);

//        처음부터 new 연산자로 배열 선언과 배열 생성하는 경우
//        : new 연산자로 배열 처음 생성하면 배열 항목은 기본 값으로 초기화 됨
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화 된 값 : " + doubleArray[0]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 1.1;
        doubleArray[2] = 3.4;
        System.out.println("doubleArray[0] : "+doubleArray[0]);
        System.out.println("doubleArray[1] : "+doubleArray[1]);
        System.out.println("doubleArray[2] : "+doubleArray[2]);

//        ///////////////////////////////////
//        배열 길이
//        - 배열변수.lenth
//        - lenth 필드는 읽기만 가능, 값 변경 불가능
//        - 반복문에서 배열length 사용 자주 함
        System.out.println("doubleArray 길이 : "+ doubleArray.length);

//      배열 길이를 벗어난다면?
//        System.out.println(doubleArray[doubleArray.length]);// error : ArrayIndexOutOfBoundsException


//        ///////////////////////////////
        //배열 출력
//        -toString() : 배열 내용을 문자열로 변환해서 반환
//        - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶을때 사용하면 됨
        System.out.println("intArray : " + Arrays.toString(intArray));
        System.out.println("charArray : " + Arrays.toString(charArray));
        System.out.println("doubleArray : " + Arrays.toString(doubleArray));

//        ///////////////////////////////
//        다차원 배열
//        - 배열 안에 또 다른 배열이 존재하는 배열
//        2 x 3 배열 생성 및 초기화 :  int [][] matrix = {{1,2,3},{4,5,6}};
        int [][] matrix = {{1,2,3},{4,5,6}};

//         3 x 2 배열 생성 및 초기화 :
        int[][] matrix2 = new int[3][2];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[1][0]=3;
        matrix2[1][1]=4;
        matrix2[2][0]=5;
        matrix2[2][1]=6;

//      3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1, 2}, {3, 4}}, {{5,6}, {7,8}}};
        System.out.println("matrix : ");
        for (int i=0; i< matrix.length; i++){
            System.out.println("길이============"+matrix.length);
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("matrix[i].length :::::::::"+matrix[i].length);
//                (0,0) (0,1) (0,2)
//                (1,0) (1,1) (1,2)
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

//        matrix2
//                (1,2)
//                (1,0)
        System.out.println("matrix2 : ");
        for (int i=0; i< matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

//        3차원 배열의 값 출력;
        System.out.println("threeDimensionArr : ");
        for (int i=0; i< threeDimensionArr.length; i++){
            for(int j = 0; j < threeDimensionArr[i].length; j++){
                for(int k=0; k < threeDimensionArr[i][j].length; k++){
                    System.out.print(threeDimensionArr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


//    배열복사
//        -배열은 크기가 고정
//        -> 더 많은 저장 공간 필요하다면 더 큰 길이의 벼열을 새로 만들어 기존 배열을 복사하는 방법이 있음
//        ver 1. 반복문으로 요소 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];

        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        System.out.println(Arrays.toString(newArray)); // [1, 2, 3, 0, 0]


//        ver 2. arraycopy() 사용
//        : System.arraycopy(Object src, int src, Object dest, int destPos, int length);
//        - 첫번째 인자로 들어가는 Object src : 원본배열
//        - 두번쨰 인자로 들어가는 int src : 원본 배열 복사 시작 인덱스
//        - 세번째 인자로 들어가는 Object dest : 새 배열
//        - 네번째 인자로 들어가는 int destPos : 새 배열  붙여넣기 시작 할 인덱스
//        - 마지막 인자로 들어가는 int length : 복사 항목 수

        String[] originFruits = {"apple", "banana", "kiwi"}; //원본배열
        String[] newFruits = new String[5]; //새배열

//        System.arraycopy(originFruits, 0,newFruits,0,originFruits.length);
        System.arraycopy(originFruits, 1,newFruits,1,originFruits.length-2);
        System.out.println(Arrays.toString(newFruits));


//        Arrays.메소드()
//        1. Arrays.copyOf(배열, copyArrayLength)
        int[] originalArray = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originalArray, 2);
        System.out.println("배열 오리지날 ======="+Arrays.toString(originalArray));
        System.out.println("배열 copyof ======="+Arrays.toString(copiedArray));

//        2. 시작과 끝을 직접 짖어하고 싶으면 copyOfRange(배열, 시작index, 끝index)
        int[] rangeArray =Arrays.copyOfRange(originalArray,3,4);
        System.out.println("배열 rangeArray ======="+Arrays.toString(rangeArray));


//    3. fill(배열, 나머지채울값)
        int[] filledArray = new int[5];
        System.out.println("filledArray(before) : " +Arrays.toString(filledArray)); // [0,0,0,0,0]
        Arrays.fill(filledArray, 7);
        System.out.println("filledArray(after) : "+ Arrays.toString(filledArray)); // [7,7,7,7,7]
//        System.out.println("배열 filled Array(before) ====="+Arrays.toString(filledArray));


//    4. Arrays.sort(배열)
        int[] unsortedArray = {5,3,4,2,1};
        Arrays.sort(unsortedArray);
        System.out.println("Sorted Array : " + Arrays.toString(unsortedArray));

//    5. Arrays.equals(배열1, 배열2) : 두 배열의 각각의 요소 값이 동일한지 비교해서 true/false 반환
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,5,3};

        boolean arraysEqual = Arrays.equals(array1,array2);
        boolean arraysEqual2 = Arrays.equals(array1,array3);

        System.out.println("111111" + arraysEqual);
        System.out.println("다르니???"+ arraysEqual2);

//        ==비교시 //주소값을 참조하기 때문에 내용이 같아도 false가 나오기때문에 equals를 이용해야 됨
        System.out.println("Arrays == 1 : " + (array1 == array2));
        System.out.println("Arrays == 2 : "+ (array1 == array3));


//     6. Arrays.deepEquals (배열1, 배열2) : 다차원 비교시
        int[][] deepArray1 = {{1,2}, {3,4}};
        int[][] deepArray2 = {{1,2}, {3,4}};
        int[][] deepArray3 = {{5,2}, {3,4}};

        boolean deepArraysEqual = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deepArraysEqual2 = Arrays.deepEquals(deepArray1, deepArray3);


        System.out.println("deepEquals 1 : "+deepArraysEqual);
        System.out.println("deepEquals 2 : "+deepArraysEqual2);


//        7. Array.binarySearch(배열, index) : 단, 배열은 정렬된 상태여야되니까 sort먼저!!
//        : 배열의 특정 인덱스 요소값을 이진 검색 알고리즘을 사용하여 검색한 후 , 해당 위치 반환
//                                             이진 검색 알고리즘을 사용하므로 매개변수로 전달되는 배열이 sort()등을 사용하여 미리 정렬되어 있어야만 제대로 동장

        int[] sortedArray = {10, 30, 50 , 70 , 90};
        int index = Arrays.binarySearch(sortedArray, 50);
        System.out.println("binarySearch로 50이 몇번째인지? : "+ index);



//        ////////////////////////////////////////////
//        ArrayList
//        - ArrayList클래스 : 표준 배열보다 느릴 수 있지만 배열에서 많은 조작이 필요시 유용하게 사용되는 클래스
//        - 동적할당 : 크기를 미리 정하지 않아도 됨!, 크기 변할 수 있다는 말
//        ArrayList<Integer같은 type> 변수명 = new ArrayList<>(); 동적할당이라서 크기를 안쓴거임

//        ArrayList 메소드
//        ArrayList.add(값) : 맨 뒤에 추가
//        ArrayList.add(index, 값) : index 위치에 값이 추가됨
//        ArrayList.addAll()
//        ArrayList.size() : leghth랑 똑같은 역할 . ArrayList의 길이를 알려줌
//        ArrayList.get(index) : index에 해당하는 요소 리턴
//        ArrayList.indexOf(매개변수) : params와 같은 첫번째 요소의 index 리턴, 없으면 -1 리턴


        }
    }
