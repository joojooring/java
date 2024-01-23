package _05_java_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleGetSetcorrect {

        //    클래스 블럭에 선언에 하는게 필드임
        private int width;
        private int height;

        //    생성자 생성 : 생성자가 호출되는 시점은 객체를 만들때임!!!!
        public RectangleGetSetcorrect(int width){
//       필드명과 매개변수이름이 같으니까 this를 이용하여 필드값에 접근
            this.width = width;
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

        public static void main(String[] args) {
//          Rectangle 객체를 담는 ArrayList 생성
            ArrayList <RectangleGetSetcorrect> rectangles = new ArrayList<>();
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
                RectangleGetSetcorrect rectangle = new RectangleGetSetcorrect(width);
//                System.out.println("넓이 : "+rectangle.area());
                rectangle.setHeight(height); // 세로 길이 설정 완료

//                ArrayList에 Rectangle 객체 추가
                rectangles.add(rectangle);

            }

//            입력된 Rectangle 객체들의 정보 출력
            System.out.println("\n입력된 Rectangle들 정보");

//            반복문을 통해 ArrayList 출력
            for( RectangleGetSetcorrect array :  rectangles ){
                System.out.println("가로 길이는 : "+ array.getWidth()  );
                System.out.println("세로 길이는 : "+ array.getHeight() );
                System.out.println("넓이는 : "+array.area() );
                System.out.println("==========================");
            }
            scanner.close();
        }

    }
