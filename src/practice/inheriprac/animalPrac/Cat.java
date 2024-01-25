package practice.inheriprac.animalPrac;

public class Cat extends Animal{

    public Cat(String name, int age){
        super("고양이", name,age);
    }

    public void makeSound(){
        System.out.println("애옹");
    }
}
