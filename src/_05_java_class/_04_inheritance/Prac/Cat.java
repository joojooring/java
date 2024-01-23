package _05_java_class._04_inheritance.Prac;

public class Cat extends Animal{

    public String action;

    public Cat(String specific, String name, int age){
        super(specific, name, age);

    }

//    자식클래스 Cat의 필드에 해당하는 생성자는 public void로 생성
    public void setCat(String action){
        this.action = action;
        System.out.println(action+"고양이는 식빵을 굽지");
    }

}
