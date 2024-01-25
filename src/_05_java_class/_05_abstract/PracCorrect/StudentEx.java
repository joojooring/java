package _05_java_class._05_abstract.PracCorrect;

public class StudentEx {
    public static void main(String[] args) {
        //    String name,String school,int age,int studentId
        Kim std1 = new Kim("김철수", "abc 고등학교", 17,20220001);
        Baek std2 = new Baek("백영희","xyz고등학교", 18, 20220002);

        System.out.println("===="+std1.name + " 학생의 정보"+"====");
        System.out.println("학교 : " +std1.school);
        System.out.println("나이 : " +std1.age);
        System.out.println("학번 : " +std1.studentId);
        std1.todo();

        System.out.println("===="+std2.name + " 학생의 정보"+"====");
        System.out.println("학교 : " +std2.school);
        System.out.println("나이 : " +std2.age);
        System.out.println("학번 : " +std2.studentId);
        std2.todo();
    }
}
