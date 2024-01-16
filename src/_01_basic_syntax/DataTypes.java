package _01_basic_syntax;

//sout 단축키 : system.out.println()
//main 단축키 : public static void main

//java에서는 끝에 ;세미콜론을 무조건 찍어줘야 됨
//Primtive Type (기본형)
//- 사용되기 전에 선언되어야 함
//- os에 따라 자료형 기링 변하지 않음
//-"비객체" 타입 => null값을 가질 수 없음

//Reference Type(참조형)
//- java. lang.Object 상속받음
//- 기본형이 아니면 다 참조형
public class DataTypes {
    public static void main(String[] args) {
        char name; // 가능o
//        int 2name; //숫자 첫 글자 사용 불가능
        int student_Id$; //특수 기호는 언더바_랑 달러$만 가능
        int name2;
//        char for; //예약어(키워드)는 불가능

//        Primitive Type(기본형)
        System.out.println("---기본형---");
//        정수형 변수 선언
        int x = 10;
        long y = 10000000000000L; //long 타입은 뒤에 대문제L 또는 소문자 ㅣ을 붙여야 됨
        short z = 32545;
        byte b = 127;

//        실수형 변수 선언
        float a = 3.14f; //float 타입은 뒤에 f나 F를 붙여줘야 됨
        double c = 2.71254;

//        문자형 변수 선언
        char ch = 'A';

//        논리형 변수 선언
        boolean bool = true;

//        변수 출력
        System.out.println("정수형 변수: " + x + "," + y + "," + z + "," + b);
        System.out.println("실수형 변수 :" + a + "," + c );
        System.out.println("문자형 변수 : "+ ch);
        System.out.println("논리형 변수 : "+ bool);



/////////////////////////////////////////////////////////////////////////////
//        Reference Type(참조형)
        System.out.println("---참조형---");

//        String 참조형 변수 선언과 초기화
//        - Java에서 String 타입은 특별함. 참조형이지만 기본형처럼 사용함. (불변객체)
//        -기본 자료형은 "= =" 값을 비교시 =연산자를 통해 비교하지만, String 객체간 비교는 .equals()메서드 사용
        String greeting = "Hello, JOOJOO!";

//        배열(Array) 참조형 변수 선언과 초기화
        int[] nums = {1,2,3,4,5};

//        클래스(Class) 참조형 변수 선언과 초기화
        Person person = new Person("John",30);

//        출력
        System.out.println("String 변수 : "+greeting);
        // ver. 일반 for 문
        System.out.print("배열 변수: ");
        for(int i =0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        //ver. for-each문
        for(int num : nums){
            System.out.print(num + " , ");
        }
        System.out.println();
        System.out.println("Person 객체 : " + person.getName()+","+person.getAge());
//

    }
}

//클래스(추후 배울 예정)
class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    함수 이름 앞에 get을 붙여주면 됨
    public String getName(){return name;}
    public int getAge(){return age;}
}