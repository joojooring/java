package _05_java_class._05_abstract.Prac;

public class StudentEx {
    public static void main(String[] args) {
        Kim std1 = new Kim("김철수", "ABC 고등학교",17,20220001);
        Baek std2 = new Baek("백영희", "XYZ 고등학교",18,20220002);

        System.out.printf("===%s 학생의 정보===", std1.getName());
        System.out.println("\n");
        System.out.println("학교 : "+std1.getName());
        System.out.println("나이 : "+ std1.getAge());
        System.out.println("학번 : "+std1.getStudentnumber());
        std1.todo();
        System.out.println("\n");

        System.out.printf("===%s 학생의 정보===", std2.getName());
        System.out.println("\n");
        System.out.println("학교 : "+std2.getName());
        System.out.println("나이 : "+ std2.getAge());
        System.out.println("학번 : "+std2.getStudentnumber());
        std2.todo();
        System.out.println("\n");
    }


}
