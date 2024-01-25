package _05_java_class._05_abstract.Prac;

public class Baek extends Student{

    public Baek(String name, String school, int age, int studentnumber){
        super(name, school,age,studentnumber);
    }

    @Override
    void todo() {
        System.out.println("백종원 피자");
    }
}
