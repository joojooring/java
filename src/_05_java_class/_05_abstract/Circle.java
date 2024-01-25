package _05_java_class._05_abstract;

// Shape를 상속받아서 구체적인 클래스로 구현해줄거임
public class Circle extends Shape{

//    1. 자식클래스의 생성자 생성
    public Circle(String color){
        super(color);
    }

//    2. 추상 메소드 구현
    void draw(){
        System.out.println("원 그리기");
    }
}
