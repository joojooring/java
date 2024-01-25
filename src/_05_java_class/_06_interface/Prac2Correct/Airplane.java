package _05_java_class._06_interface.Prac2Correct;

public class Airplane extends Vehicle implements Flyable{

    public Airplane(String name, int maxSpeed){
        super(name,maxSpeed);
    }

//    move 메서드 오버라이드
    @Override
    public void move(){
        System.out.println(getName()+"가 하늘을 나는 중");
    }

//    implements한 Flyable에도 fly추상메소드 구현
    @Override
    public void fly(){
        System.out.println("고도 10,000피트에서 비행 중");
    }
}
