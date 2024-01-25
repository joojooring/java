package _05_java_class._06_interface.Prac2Correct;

public class Car extends Vehicle{

    public Car(String name, int maxSpeed){
        super(name,maxSpeed);
    }
    @Override
    public void move(){
        System.out.println(getName()+"가 도로를 따라 이동중");
    }

}
