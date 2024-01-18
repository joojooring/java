import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        int[] numbers = {10, 3};
        double sum = sum(numbers[0], numbers[1]);
        double minus = minus(number, number2);
        double divide = divide(numbers[0], numbers[1]);
        double multiple = multiple(number, number2);
        System.out.println("덧셈 결과 : " + sum);
        System.out.println("뺄셈 결과 : " + minus);
        System.out.println("나눗셈 결과 : " + divide);
        System.out.println("곱셈 결과 : " + multiple);
    }

    public static double sum(int x, int y) {
        return x + y;
    }
    public static double minus(int x, int y) {
        return x - y;
    }
    public static double divide(int x, int y) {
        return (double) x / y;
    }
    public static double multiple(int x, int y){
        return x * y;
    }

}
