package _05_java_class._05_abstract.Prac2;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {

        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

//        Circle 객체 생성
        Circle circle = new Circle("Red","원", 5.0);
//        생성한 Circle 객체를 circles ArrayList에 추가
        circles.add(circle);

        System.out.println("===Circle 도형의 정보===");
        System.out.println("도형의 색상 : "+circle.getColor());
        circle.calculateArea();
        //System.out.println("도형의 넓이 : "+circle.calculateArea(););


//        Rectangle 객체 생성
        Rectangle rectangle =new Rectangle("Blue","직사각형", 4,6);
//        생성한 Rectangle 객체를 rectangles ArrayList에 추가
        rectangles.add(rectangle);

        System.out.println("=== Rectangle 도형의 정보===");
        System.out.println("도형의 색상 : "+rectangle.getColor());
        rectangle.calculateArea();


    }
}
