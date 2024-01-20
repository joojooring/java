package practice;

import java.util.Scanner;

public class RectanglePrac {

//    필드 (변수) 생성
    public int width;
    public int height;

//    매개변수로 width, height를 받아서 생성자 생성 : 이 생성자는 해당 필드를 초기화 시킴;

    public RectanglePrac(int width, int height){
        this.width = width;
        this.height = height;
    }

//    area 메소드 생성 :
    public int area(){
        return (width* height);
    }


//    main메소드:
//    - main에서 사용자에게 입력받을 scanner 사용
//    - Rectangle 객체 생성 : RectanglePrac test = new RectanglePrac();
//    객체 생성 방법 : new 키워드 사용해서 , 클래스명 객체명 = new 클래스명();
//    객체화한다. = 인스턴스화 = 클래스로부터 객체를 만든다.
//    인스턴스? 클래스로부터 만들어진 객체
//    =>> 클래스로 부터 여러 개의 인스턴스를 만들 수 있음

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해라");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        RectanglePrac rectangle = new RectanglePrac(width, height); // RectanglePrac 객체를 생성하고, 입력받은 가로와 세로 길이를 생성자에 전달하여 객체를 초기화합니다.

        int area = rectangle.area();
        System.out.println(area);
    }
}
