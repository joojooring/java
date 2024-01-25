package _05_java_class._05_abstract.PracCorrect;

// 1. 추상클래스 정의
public abstract class Student {
//    2. 변수 생성 : 이름, 학교,나이, 학번
    protected String name;
    protected String school;
    protected int age;
    protected int studentId;

    public Student(String name,String school,int age,int studentId){
        this.name=name;
        this.school=school;
        this.age=age;
        this.studentId=studentId;

    }

    abstract void todo();
}
