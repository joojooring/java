package _05_java_class._04_inheritance.Prac2;

public class Car extends Vehicle {
    private boolean covertible;

    public boolean isCovertible() {
        return covertible;
    }

    public void setCovertible(boolean covertible) {
        this.covertible = covertible;
    }

    public Car(String brand, String model, int year ){
        super();
        setBrand("도요타");
        setModel("Camry");
        setYear(2023);
    }

    public void Type(){
        System.out.println("주차했습니다.");
    }

}