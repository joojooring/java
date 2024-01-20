package _05_java_class._01_class;

import practice.RectanglePrac;

import java.util.Scanner;

public class Rectangle01 {

//    클래스 블럭에 선언에 하는게 필드임
    public int width;
    public int height;

//    생성자 생성 : 생성자가 호출되는 시점은 객체를 만들때임!!!!
    public Rectangle01(int width, int height){
//       필드명과 매개변수이름이 같으니까 this를 이용하여 필드값에 접근
        this.width = width;
        this.height = height;
    }

    public int area(){
        return width*height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형의 가로 세로 길이를 띄어쓰기를 기준으로 입력해라");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

//        사용자로부터 입력 받은 값으로 Rectangel01 객체 생성
        Rectangle01 rectangle = new Rectangle01(width, height);

        System.out.println("넓이 : "+rectangle.area());

        scanner.close();
    }
}
