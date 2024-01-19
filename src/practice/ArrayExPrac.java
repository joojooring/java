package practice;

import java.util.Arrays;

public class ArrayExPrac {
    public static void main(String[] args) {
        int[] arr1; // 타입 [] 변수명;
        String [] temp = null;
        System.out.println(temp); // 출력 : null

//       값의 목록으로 배열 변수 선언과 배열 생성
        int [] intArray = {8,9,7,8,5};
        System.out.println("intArray[0] : "+ intArray[0]);

        // 값 변경시
        intArray[3] = 999 ;
        System.out.println("intArray[3]"+intArray[3]);

//        주의!
//        - 중괄호{}로 감싼 목록을 배열 변수에 대입할 떄, 배열 변수를 미리 선언한 수에는 값 목록을 변수에 대입 불가능 함.
//        char[] charArray;
//        charArray = {"a","b","v"}; // 컴파일 에러가 뜸
//        배열 변수 선언 시점과, 값 목록 대입하는 시점이 다르다면 "new 타입[]"을 중괄호 앞에 붙여서 대입해줘야 됨
        char[] charArray;
        charArray = new char[]{'a', 'b','c'};
        System.out.println("charArray[0] : "+charArray[0]);

//        처음부터 new 연산자로 배열 선언과 배열 생성하는 경우
//        : new 연산자로 배열 처음 생성하면 배열 항목은 기본 값으로 초기화 됨
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화 된 값 : " + doubleArray[0]);
        doubleArray[0] = 0.25;
        doubleArray[1] = 1.55;
        doubleArray[2] = 4.2365;
        System.out.println("doubleArray[0] : "+doubleArray[0]);
        System.out.println("doubleArray[1] : "+doubleArray[1]);
        System.out.println("doubleArray[2] : "+doubleArray[2]);


//      배열 길이
//      - 배열변수.length
        System.out.println("doubleArray 길이 : "+ doubleArray.length);


//        배열 출력
//        - Arrays. toString() : 배열 내용을 문자열로 변환해서 반환
//        - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고 싶을떄 사용하면 됨
        System.out.println("intArray ==="+ Arrays.toString(intArray));
        System.out.println("charArray ==="+ Arrays.toString(charArray));
        System.out.println("doubleArray ==="+ Arrays.toString(doubleArray));

//        다차원 배열
//        - 배열 안에 또 다른 배열이 존재하는 배열
//        2x3 배열 생성 및 초기화 : int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix = {{2,3,5},{4,8,6}};

//        3x2 배열 생성 및 초기화;
        int[][] matrix2 = new int[3][2];
        matrix2[0][0]=1;
        matrix2[0][1]=2;
        matrix2[1][0]=3;
        matrix2[1][1]=4;
        matrix2[2][0]=5;
        matrix2[2][1]=6;


//        3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1,2},{4,4}},{{3,2},{6,6}}};

        System.out.println("matrix : ");
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println("2차원 배열 길이! : "+ matrix.length);
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println("matrix[i].length가 뭘까?? : " +matrix[i].length);

                System.out.println(matrix[i][j] +" ");

            }
            System.out.println();
        }
    }
}
