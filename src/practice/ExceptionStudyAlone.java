package practice;

//예외처리
// - 일반 예외 ( Exception ) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 ( Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

//=> 자바에서는 예외 발생시 예외 클래스로 부터 객체를 생성, 해당 객체는 예외 처리시 사용됨
// 예외 발생시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 예외처리코드라고 함

//try catch finally 블록으로 처리


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudyAlone {


//    먼저 divide 메소드 생성

    public static String divide (int x, int y) {
        return x +"/" + y + "=" + (x/y);
    }

    public static int getLength (String str) {
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx) {
        return arr[idx];
    }

    public static void main(String[] args) {

//        case1 예외 발생 코드
//        System.out.println(divide(6,0)); //java.lang.ArithmeticException: / by zero
//        case1. 예외 처리 코드
        try{
            System.out.println("----연산 시작----");
            System.out.println(divide(6,0));
        }catch (ArithmeticException e){
//            예외 출력 방법
//            방법 1 : 예외 발생한 이유만 보여줌 . (e.getMessage())
            System.out.println("나누기 중 오류 발생 : " + e.getMessage()); // / by zero

//            방법 2 : 예외 종류 리턴( e.toString())
            System.out.println("나누기 중 오류 발생 : " +e.toString()); // java.lang.ArithmeticException: / by zero

//            방법 3 : 예외가 어디서 발생헀는지 추적한 내용 출력 (e. printStacktTrace())
//            e.printStackTrace(); // 빨간글씨로 원래 오류가 나는것 처럼 제일 하단에 띄워줌
        }finally {
            System.out.println("-----연산 끝 ------");
        }




//        ////////////////////////////////////////////
//        case2. 예외 발생 코드 : 참조 변수가 null인 상태에서 필드나 메소드에 접근한 경우
//        System.out.println("단어길이 : " +getLength(null)); //java.lang.NullPointerException
//        case2. 예외 처리 코드
        try {
            System.out.println("단어 길이 : " + getLength(null));
        }catch (NullPointerException e){
            System.out.println("단어 길이 연산 중 에러 발생 >> "+e.toString());
        }

//        ///////////////////////////////////////
//        case3. 예외 발생 코드 : 배열의 인덱스 범위를 벗어나는 경우
        int[] numbers = {10,20,30,40,50};
//        System.out.println(getValueByIdx(numbers,numbers.length)); //java.lang.ArrayIndexOutOfBoundsException
        try{
            System.out.println(getValueByIdx(numbers,numbers.length));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 범위를 벗어났습니다. " + e.toString());
        }

//        ////////////////////////////////
//        case4. 입력 받을 때 오류
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("정수를 입력해라 : ");
            int number = sc.nextInt();
            System.out.println("입력한 정수 :  "+ number );
        }catch (InputMismatchException e){
//            정수 이외의 값이 입력되면 오류 발생!!
            System.out.println("InputMismatchException 오류 발생 !" + e.toString());

        }
    }
}
