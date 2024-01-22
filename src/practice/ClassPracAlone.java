package practice;

import _05_java_class._01_class.ClassName;

import java.util.Scanner;

public class ClassPracAlone {

//    필드(변수)
    public int width, height;

//    생성자 : 클래스 이름과 동일한 이름을 갖는 특별한 종류의 메서드!
//    - 객체가 생성될 때 자동으로 호출되는 메소드
//    - 객체의 초기화 담당
    public ClassPracAlone(int width, int height){
        this.width = width;
        this.height = height;
    }


    public int area(){
     return  width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해라.");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

//        객체 생성
        ClassPracAlone rectangle = new ClassPracAlone(width, height);
        rectangle.area();
        System.out.println(rectangle.area());
    }

}
