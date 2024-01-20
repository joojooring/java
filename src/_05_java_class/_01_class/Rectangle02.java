import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle02 {

    private int width;
    private int height;

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

    public Rectangle02(int width) {
        this.width = width;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사각형의 가로 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");


        ArrayList<Rectangle02> rects = new ArrayList<>();

        while (true) {
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == 0 || height == 0) {
                break;
            } else {


            Rectangle02 rectangle = new Rectangle02(width);
            rectangle.setHeight(height);
            rects.add(rectangle);

            }

        }
        scanner.close();

        System.out.println("지금까지 입력한 사각형 정보:");

        for (Rectangle02 rect : rects) {
            System.out.println("가로 길이: " + rect.getWidth());
            System.out.println("세로 길이: " + rect.getHeight());
            System.out.println("넓이: " + rect.area());
            System.out.println(" ---------------- ");
        }
    }
}
