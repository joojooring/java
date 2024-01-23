package _05_java_class._04_inheritance.Prac2;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startsaying(){
        System.out.println("차량 시동을 걸었습니다.");
    }
    public void endsaying(){
        System.out.println("차량을 정지했습니다.");
    }
}
