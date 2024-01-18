package _02_controllStatement;

public class Prac6 {
    public static void main(String[] args) {
        Prac6 ol = new Prac6();

        System.out.println("반지름이 5인 원의 넓이 : "+ol.multiple(5,5,Math.PI));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : "+ol.multiple2(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 :"+ol.multiple3(6, 3,2));
    }
    public double multiple(double a, double b, double c){
        return a*b*Math.PI;
    }
    public double multiple2(double a, double b){
        return a*b;
    }
    public double multiple3(double a, double b, double c){
        return  (a*b)/c;
    }
}
