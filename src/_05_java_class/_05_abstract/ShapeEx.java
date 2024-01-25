package _05_java_class._05_abstract;

public class ShapeEx {

//    실행할 class에선 main을 추가해야됨!!
    public static void main(String[] args) {
//        shape 객체는 new 연산자로 직접 생성할 수 없지만,
//        자식 클래스인 Circle이랑 Square에서는 new 연산자로 객체 생성 가능
        Circle circle = new Circle("blue");
        Square square = new Square("red");

        circle.start();
        circle.draw();
        System.out.println("원의 색상은 : " + circle.getColor());

        square.start();
        square.draw();
        System.out.println("원의 색상은 : " + square.getColor());

    }

}
