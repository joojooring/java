package _05_java_class._04_inheritance.PracCorrect;

//Cat 클래스, Animal 클래스 상속 받음
public class Cat extends Animal {

//    1. 생성자
//    - 부모 Animal 클래스의 생성ㅈ아를 호출해서 초기화를 해야됨!
//    - 부모 클래스에서 생사자에 매개변수를 받기 때문임!
    public Cat(String name, int age){
        super("고양이",name,age);
    }

//    Override
    @Override
    public void makeSound(){
        System.out.println("애옹-");
    }
}
