package _05_java_class._02_static;

import _05_java_class._01_class.RectangleGetSetcorrect;

import java.util.ArrayList;
import java.util.Scanner;

public class RectanglePrac3correct {
    private int width;
    private int height;

//    Rectangle instance의 개수를 추적하는 class 변수
    private static int instanceCount = 0; // 생성자가 호출되는건 객체가 만들어질때이므로 초기화는 변수선언에서 아예 초기화까지 해줌

    //    생성자 생성 : 생성자가 호출되는 시점은 객체를 만들때임!!!!
    public RectanglePrac3correct(int width){
//       필드명과 매개변수이름이 같으니까 this를 이용하여 필드값에 접근
        this.width = width;
        instanceCount++; // 새로운 Rectangle 인스턴스가 생성될 때마다 개수가 증가
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return width*height;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }
    public static void main(String[] args) {
//          Rectangle 객체를 담는 ArrayList 생성
        ArrayList<RectanglePrac3correct> rectangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//            사용자로부터 가로와 세로 입력받아 ArrayList에 Rectangle 인스턴스 차례로 추가
        while (true) {
            System.out.println("사각형의 가로 세로 길이를 띄어쓰기를 기준으로 입력해라");

            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if(width == 0 && height ==0){
                break;
            }
//        사용자로부터 입력 받은 값으로 Rectangel01 객체 생성
            RectanglePrac3correct rectangle = new RectanglePrac3correct(width);
//                System.out.println("넓이 : "+rectangle.area());
            rectangle.setHeight(height); // 세로 길이 설정 완료

//                ArrayList에 Rectangle 객체 추가
            rectangles.add(rectangle);

        }

//            입력된 Rectangle 객체들의 정보 출력
        System.out.println("\n입력된 Rectangle들 정보");

//            반복문을 통해 ArrayList 출력
        for( RectanglePrac3correct array :  rectangles ){
            System.out.println("가로 길이는 : "+ array.getWidth()  );
            System.out.println("세로 길이는 : "+ array.getHeight() );
            System.out.println("넓이는 : "+array.area() );
            System.out.println("==========================");
        }

//        Rectangle 인스턴스 개수 출력
        System.out.println("Rectangle 인스턴스의 개수는 : "+RectanglePrac3correct.getInstanceCount());
        scanner.close();
    }

}


