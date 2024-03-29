package _05_java_class._02_static;

//정적(static) 멤버
// - 객체를 생성할 필요 없이 클래스 통해서 바로 접근 가능
// - 클래스가 메모리에 로딩되면 정적 멤버 바로 사용 가능 (객체가 아직 안만들어져도)
// - 사용 방법 : 클래스 이름과 함께 점(.) 연산자로 접근 가능
// - 정적 메소드와 정적 블록은 객체가 없이도 실행 가능하므로, 내부에 객체로 만들어지는 필드나 인스턴스 메소드 사용은 불가능
// - 객체 자신의 참조인 this도 사용 불가능

public class CalculatorStatic {

    static double pi = 3.141592; // 어떤 계산기든 파이 값이 동일하므로 static 선언을 해준거임

    public static int count = 0;
    public CalculatorStatic(){
        count++;
    }
//    static 메소드로는 utility를 만들어줌
//    plus, minus 외부에서 주어진 값(매개변수로 x,y)으로 처리하므로 정적 메서드로 처리하는 것이 유리
//    왜?? : 메소드의 매개변수가 인스턴스 필드를 이용하지 않으므로 클래스에 .점 찍어서 쓰면 됨
    static int plus (int x, int y) {
        return x+y;
    }
    static int minus (int x, int y) {
        return x-y;
    }


}
