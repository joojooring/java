package _05_java_class._02_static;

public class StudentPracCorrect {
    //    1.필드 정의
    private String name;
    private String student_ID;
    private int grade;

    //    클래스 변수 (static 변수) 총 학생수
    private static int totalStudents = 0;

    public StudentPracCorrect(String name, String student_ID, int grade) {

//    생성자로 이름, 학번, 학년 초기화필요
//    totalStudents 증가
    this.name =name;
    this.student_ID =student_ID;
    this.grade = grade;
    totalStudents++;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("===학생정보===");
        System.out.println("이름 : " +name);
        System.out.println("학번 : " +student_ID);
        System.out.println("학년 : " + grade);
    }

//    클래스 변수 getter
    public static int getTotalStudents(){
        return totalStudents;
    }

    public static void main(String[] args) {
//        학생 생성
        StudentPracCorrect std1 = new StudentPracCorrect("김새싹","1222222",5);
        StudentPracCorrect std2 = new StudentPracCorrect("박아아","1222222",5);
        StudentPracCorrect std3 = new StudentPracCorrect("항지짖","1222222",5);

//        학생 출력
        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

//        총 학생 수 출력
        System.out.println("총 학생 수 ; "+StudentPracCorrect.getTotalStudents());

    }
}
