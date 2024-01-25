package _05_java_class._05_abstract.Prac;

public abstract class Student {
    private String school;
    private int age;

    private String name;
    private int studentnumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(int studentnumber) {
        this.studentnumber = studentnumber;
    }

    public Student(String name, String school, int age, int studentnumber ){
    this.name = name;
    this.school=school;
    this.age = age;
    this.studentnumber=studentnumber;
    }


    abstract void todo();

}
