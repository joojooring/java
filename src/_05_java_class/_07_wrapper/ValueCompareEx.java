package _05_java_class._07_wrapper;

//포장 값 비교
// - 포장 객체 내부 값을 비교하기 위해 ==, != 연산자는 불가능
// - 내부값 비교시 equals() 메소드 이용
//다만, 특정 범위의 포함되는 값은 포장 객체가 공유됨 ( = 같은 참조값을 같음) => 이때는 ==, != 연산자는 가능
// - 대부분의 포장 클래스에는 "parse + 기본타입" 명으로 된 static 메소드가 존재함 => 기본 타입으로 변환할 때 사용하면 됨
//

public class ValueCompareEx {
    public static void main(String[] args) {
//        - int 일 때 -128~ -127 이내의 값을 갖는 경우
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.printf("%d == %d : %b", obj1, obj2, obj1 == obj2); // true ; 같은 주소값 참조하고 있기 때문

        Integer obj3 = 100000;
        Integer obj4 = 100000;
        System.out.printf("%d == %d : %b", obj3, obj4, obj3 == obj4); //false


    }
}
