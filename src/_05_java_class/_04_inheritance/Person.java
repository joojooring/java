package _05_java_class._04_inheritance;

//상속
// - Java에서 다중 상속이 지원X, extends 뒤에는 하나의 부모 클래스만 올 수 있음
// - 부모 클래스 = 슈퍼 클래스
// - 자식 클래스 = 서브 클래스

//부모 클래스 Person
//자식 클래스 Student

public class Person {
//    case1 : 필드가 public인 경우
//    public int age;
//    public String name;
//
////    상속 Step2. super()
////    2-1 부모 클래스가 "기본 생성자"를 갖는 경우 - 매개변수로 아무것도 넘겨받지 않는것을 의미
////    public Person(){
////        System.out.println("부모 클래스 Person()생성자가 실행되었습니다.");
////    }
//
////    2-2 부모 클래스가 "매개변수를 갖는 생성자"를 갖는 경우
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("부모 클래스 Person(name,age) 생성자 실행");
//    }
//
//    public void say(){
//        System.out.println("안녕!");
//    }
//
//    public void eat(String food){
//        System.out.println(food + "를(을) 먹고 있어요.");
//    }
//    public static void main(String[] args) {
//
//    }








//    ////////////////////////////////////////////
//    Case.2 필드가 private인 경우
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("안녕!");
    }

    public void eat(String food){
        System.out.println(food + "를(을) 먹고 있어요.");
    }



}
