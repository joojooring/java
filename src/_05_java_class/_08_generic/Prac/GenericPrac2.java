package _05_java_class._08_generic.Prac;

class Calculator<T extends Number>{
    private T num1;
    private T num2;

    public Calculator(T num1, T num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
//    public void는 메서드가 값을 반환하지 않음
//    void 반환 타입은 어떤 값을 반환하지 않고, 실행 후에 끝나게 됨

//    public void add(){
//        return num1 + num2;
//    }
}
public class GenericPrac2 {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>(5, 10);
//        double result = calculator.add();
//        System.out.println("Integer Sum : " + result);
        System.out.println("Integer Sum : " + calculator.add());

        Calculator<Double> calculator2 = new Calculator<>(Math.PI,2.5);
//        double result2 = calculator2.add();
//        System.out.println("Double Sum : " + result2);
        System.out.println("Double Sum : " +calculator2.add());
    }

}
