package _03_array;

//표준 배열

//배열
//- 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야 함
//- 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경 불가능 (단, ArrayList 컬렉션의 경우, 동적으로 크기 조절 가능)
// -

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


    }
}
