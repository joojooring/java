package _05_java_class._02_static;

public class CalculatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double circleArea = num1 * num1 * CalculatorStatic.pi;
        int plusResult = CalculatorStatic.plus(num1, num2);
        int minusResult = CalculatorStatic.minus(num1, num2);

        System.out.println("원의 넒이 : "+ circleArea);
        System.out.println("더한 값 : "+ plusResult);
        System.out.println("뺀 값 ; " +minusResult);


//        추가 예시
        CalculatorStatic c1 = new CalculatorStatic();
        CalculatorStatic c2 = new CalculatorStatic();

//        count의 접근시
        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(CalculatorStatic.count);
    }
}
