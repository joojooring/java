package _05_java_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentStaticPrac {

    static String name ;
    static int student_ID;
    static int grade;
    static int totalStudents; // 전체 학생 수를 저장할 클래스 변수


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StudentStaticPrac.name = name;
    }

    public static int getStudent_ID() {
        return student_ID;
    }

    public static void setStudent_ID(int student_ID) {
        StudentStaticPrac.student_ID = student_ID;
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGrade(int grade) {
        StudentStaticPrac.grade = grade;
    }

    public StudentStaticPrac(String name, int student_ID, int grade){
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayInfo(){
        System.out.println("=== 학생 정보 ====");
        System.out.println("이름 : "+ name);
        System.out.println("학번 : "+ student_ID);
        System.out.println("학년 : "+grade);

    }

    public static void displayTotalStudents(){
        System.out.println("총 학생 수는 : "+totalStudents);
    }
    public static void main(String[] args) {

//        객체 생성(학생을 생성)
        StudentStaticPrac std1 = new StudentStaticPrac("김새싹", 20201551,1);
        StudentStaticPrac std2 = new StudentStaticPrac("박지은", 20201622, 5);
        StudentStaticPrac std3 = new StudentStaticPrac("김바바", 21511316,5);

        // displayInfo 메서드를 사용하여 학생 정보 출력
        std1.displayInfo();
        std2.displayInfo();
        std3.displayInfo();

        displayTotalStudents();

        // 총 학생 수 출력
//        System.out.println("\n총 학생 수는 "+StudentStaticPrac.totalStudents+"명입니다.");


//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("학생정보인 이름, 학번, 학년을 입력하세요.");
//            String name = scanner.next();
//            int student_ID = scanner.nextInt();
//            int grade = scanner.nextInt();
//            scanner.nextLine();
//
//
//            StudentStaticPrac result = new StudentStaticPrac(name, student_ID, grade);
//            result.displayInfo();
//
//
//            // 입력을 마치고 루프를 종료하는 조건을 추가
//            System.out.println("더 입력하시겠습니까? (Y/N)");
//            String answer = scanner.nextLine();
//            if (answer.equalsIgnoreCase("N")) {
//                break;
//            }
//        }

    }

}
