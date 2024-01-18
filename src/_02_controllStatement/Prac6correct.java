package _02_controllStatement;

public class Prac6correct {

    //원의 넓이 계산하는 메소드
    public void getArea (int radius) {
        System.out.printf("반지름이 %d 인 원의 넓이 : %f", radius, radius*radius *Math.PI).println();
    }

    //직사각형의 넓이 계산하는 메소드
    public void getArea(int x, int y) {
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이 : %d",x,y, x*y).println();
    }

    //삼각형의 넓이 계산하는 메소드
    public void getArea(int w, int h, boolean isTriangle){
        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이 : %f", w,h,0.5 * w *h).println();
    }

    public static void main(String[] args) {
        Prac6correct pr = new Prac6correct();
        pr.getArea(5);
        pr.getArea(4,7);
        pr.getArea(6,3, true);
    }
}
