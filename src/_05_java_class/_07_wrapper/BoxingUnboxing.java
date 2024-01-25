package _05_java_class._07_wrapper;

//Wrapper? 객체형태로 쓸 때 사용

public class BoxingUnboxing {
    public static void main(String[] args) {
//        Boxing
//        - 기본 타입의 값을 포장객체로 만드는 과정
//        - 포장 클래스 변수에 값이 대입될 때 발생
         Integer obj1 = 100;
         Double obj2 = 3.14;
        System.out.println(obj1.intValue());//intValue(): Integer 객체 내부에 int값을 리턴
        System.out.println(obj2.doubleValue());// doubleValue() : Double 객체 내부의 double값 리턴

//        Unboxing
//        - 포장 객체에서 기본 타입 값을 얻는 과정
//        - 기본 타입 변수에 포장 객체가 대입될 때 발생
        int value1 = obj1;
        double value2 = obj2;
        System.out.println(value1);
        System.out.println(value2);

    }
}
