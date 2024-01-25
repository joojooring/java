package _05_java_class._04_inheritance.PracCorrect;

public class AnimalEx {
    public static void main(String[] args) {
//        객체를 만들때 Cat 생성자에서 name과 age라는 두가지 매개변수를 필요하기 때문에
//        객체 생성시 매개변수로 받아서 값을 넣어주면 됨
        Cat cat = new Cat("나비", 5);
        Dog dog = new Dog("퐁이",5);

        System.out.println("====고양이 정보===");
        System.out.println("종 : "+cat.getSpecies());
        System.out.println("이름 : "+cat.getName());
        System.out.println("나이 : "+cat.getAge());
        cat.makeSound();

        System.out.println("====강아지 정보====");
        System.out.println("종 : "+dog.getSpecies());
        System.out.println("이름 : "+dog.getName());
        System.out.println("나이 : "+dog.getAge());
        dog.makeSound();
    }
}
