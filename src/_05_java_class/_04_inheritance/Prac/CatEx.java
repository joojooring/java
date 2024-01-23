package _05_java_class._04_inheritance.Prac;

public class CatEx {
    public static void main(String[] args) {
        Cat cat1 = new Cat("고양이","나비",8);;

        System.out.println(cat1.specific);
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        cat1.setCat("");
        System.out.println(cat1.action);

        cat1.makeSound();
    }
}
