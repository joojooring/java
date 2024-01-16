package _01_basic_syntax;

//main을 치면 public static void가 나옴
//형변환
// - 데이터 타입을 변환하는 것
// - (type)var
// - type : 데이터 유형 (자료형)
// - var : 변수 이름

public class Casting {
    public static void main(String[] args) {

    //묵시적 형변환 (Wider Conversion)
    // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
//        - 반대의 경우에는 묵시적 형변환이 불가능 -> 명시적으로 변환해야 됨
        int smallNumber = 10;
        double bigNumber = smallNumber; //int를 double로 자동형변환해줌
        System.out.println("small : " + smallNumber);
        System.out.println("big : " + bigNumber);

//        //////////////////////////////////
//        명시적 형변환 (Narrow Conversion)
//        - 더 큰 타입에서 더 작은 타입으로 강제 형변환
        double anotherBig = 20.5;
        int anotherSmall = (int)anotherBig; // double을 int로 강제 형변환
        System.out.println("anotherSmall : " + anotherSmall);
        System.out.println("anotherBig : " + anotherBig);

//  데이터 손실이 발생할 수 있는 경우 주의해야 됨
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;

        System.out.println("largerNumber : " + largeNumber);
        System.out.println("smallByte : " + smallByte);



    }
}
