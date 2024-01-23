package _05_java_class._03_final;

import java.util.Scanner;

public class CircleFinalPrac {

    final double RADIUS ;

    public CircleFinalPrac(){
        this.RADIUS = 10;
    }

//    static final double PI =3.141592;
    static final double PI = Math.PI;
    public double calculateArea(){
        return RADIUS*RADIUS*PI;
    }

    public static void main(String[] args) {
        CircleFinalPrac result = new CircleFinalPrac();
        result.calculateArea();


        System.out.println("원의 반지름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        double RADIUS = scanner.nextDouble();

        System.out.println("원의 반지름 : "+result.RADIUS);
        System.out.println("원의 넒이 : "+result.calculateArea());
    }

}
