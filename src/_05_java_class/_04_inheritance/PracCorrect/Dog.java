package _05_java_class._04_inheritance.PracCorrect;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super("멍멍이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("왈왈-");
    }
}
