package _05_java_class._05_abstract.PracCorrect;

public class Kim extends Student {

    public Kim(String name,String school,int age,int studentId){
        super(name,school,age,studentId);
    }

    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}
