package _05_java_class._04_inheritance.Prac;

public class AnimalEx {
    public static void main(String[] args) {

        System.out.println("======고양이=====");
        Cat cat1 = new Cat("고양이","나비",8);
        System.out.println(cat1.specific);
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        cat1.setCat("");
//        System.out.println(cat1.action);
        cat1.makeSound();
        System.out.println("\n");


        System.out.println("====강아지====");
        Dog dog1 = new Dog("강아지", "퐁이",5);
        System.out.println(dog1.specific);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        dog1.setAction("");
        dog1.makeSound();
    }
}
