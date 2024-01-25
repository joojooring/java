package practice.inheriprac.animalPrac;

public class AnimaEx {

    public static void main(String[] args) {
        Cat cat = new Cat("나비", 3);
        Dog dog = new Dog("퐁이", 5);

        System.out.println("===고양이 정보===");
        System.out.println("종 :"+cat.getSpecies() );
        System.out.println("이름 : "+cat.getName());
        System.out.println("나이 : "+ cat.getAge());
        cat.makeSound();
        System.out.println("=======");


        System.out.println("===강아지 정보===");
        System.out.println("종 :"+dog.getSpecies());
        System.out.println("이름 : "+dog.getName());
        System.out.println("나이 : "+dog.getAge());
        dog.makeSound();
        System.out.println("=====");
    }
}
