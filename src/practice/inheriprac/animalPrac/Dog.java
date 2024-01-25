package practice.inheriprac.animalPrac;

public class Dog extends Animal{

    public Dog(String name, int age){
        super("멍멍이", name,age);
    }

    public void makeSound(){
        System.out.println("왈왈");
    }
}
