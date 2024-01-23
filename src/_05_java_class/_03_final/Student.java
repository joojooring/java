package _05_java_class._03_final;

public class Student {

//    final 필드로 선언

//    1.필드 선언시 초기화
    final String campus = "용산";

//    2.생성자에서 초기화 하는 방법
    final String sid;
        //생성자에서 값을 매개변수로 받아야 초기화 가능
    public Student(String sid){
        this.sid = sid;
    }

    public static void main(String[] args) {
//        객체를 만들어 줘야됨
        Student std1 = new Student("s001");
        System.out.println(std1.campus);
        System.out.println(std1.sid);

        Student std2 = new Student("s002");

//        final 필드 값 변경 불가능
//        std1.campus = "영등포"; //에러코드
    }
}
