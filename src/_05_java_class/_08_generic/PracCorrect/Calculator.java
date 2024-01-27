package _05_java_class._08_generic.PracCorrect;

public class Calculator <T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2){
        this.num1=num1;
        this.num2=num2;
    }

//    더하기 메소드
    public double add(){
        System.out.println(num1.doubleValue());
        return num1.doubleValue()+num2.doubleValue();
    }

    public static void main(String[] args) {
//    정수형 계산
        Calculator<Integer> integerCalculator = new Calculator<>(5,10);
        System.out.println("Integer Sum : " + integerCalculator.add());

        Calculator<Double> doubleCalculator = new Calculator<>(2.14, 24.5);
        System.out.println("Double Sum : "+doubleCalculator.add());
    }
}
