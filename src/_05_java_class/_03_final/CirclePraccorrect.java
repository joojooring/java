package _05_java_class._03_final;

import java.util.Scanner;

public class CirclePraccorrect {

//    반지름을 final 필드로 만들어줌
    private final double radius;
//    PI는 상수로 만들어줌
    private static final double PI = Math.PI;


    public CirclePraccorrect( double radius ){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("반지름 입력해 : ");
        double radius = scanner.nextDouble();

//        circle 객체 생성
        CirclePraccorrect circle = new CirclePraccorrect(radius);

//        반지름, 넓이 출력
        System.out.println("원의 반지름 : "+circle.radius);
        System.out.println("원의 넓이 : "+circle.calculateArea());

        scanner.close();
    }
}
