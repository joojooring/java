package _05_java_class._05_abstract.PracCorrect;

public class Baek extends Student {

    public Baek(String name,String school,int age,int studentId){
        super(name,school,age,studentId);
    }

    public void todo(){
        System.out.println("점심은 백종원 피자");
    }
}
