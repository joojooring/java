package _05_java_class._04_inheritance.Prac;

public class Dog extends Animal{

    public String action;

    public Dog(String specific,String name, int age){
        super();
        this.specific=specific;
        this.name=name;
        this.age=age;
    }

    public void setAction(String action){
        this.action=action;
        System.out.println(action+"멍멍이는 발발대지");
    }
    @Override
    public void makeSound(){
        System.out.println("멍멍-");
    }
}

