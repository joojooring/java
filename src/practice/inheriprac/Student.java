package practice.inheriprac;

public class Student extends Person {
//    case1 : 필드가 public인 경우

//    자식클래스의 필드
    public String campus;


//    2-1. 부모 클래스가 기본 생성자
    public Student(String name, int age){
//        super(); // 생략되어있음(부모클래스를 가져오는거_컴파일시 자동생성)
        this.age = age;
        this.name = name;
    }

    public void setCampus(String campus){
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부 중");
    }

    //    메소드 오버라이딩( @Override)
//    - 부모 클래스의 메소드를 자식 클래스에서 재정의
//    메소드 이름, 매개변수 타입 및 개수, 리턴 타입 등 모든 것 동일하게
    @Override // 어노테이션이라고 하고 생략 가능!

    public void say(){
        System.out.println("오버라이드 덮어쓰기");
    }


    public static void main(String[] args) {
        Student std1 = new Student("빵빵아", 55);
//        Case1 : 부모와 자식 클래스의 필드가 public인 경우
//        Person(부모클래스)로 부터 상속받은 필드값을 읽을 때는 그냥 출력하면 됨. 다 public이니까
        System.out.println(std1.name);
        System.out.println(std1.age);
//
////        자식 클래스 필드 값을 읽을 때도 동일하게 바로 접근 가능
//        System.out.println(std1.campus); // null(setter 실행을 안했기때문) -> std1.setCampus("새싹 용산");
//
////        Person(부모클래스)으로 부터 상속받은 메소드 호출
        std1.say();
        std1.eat("바나나");
//
//
////        Student 메소드 호출
        std1.setCampus("새싹 용산");
        System.out.println(std1.campus);
    }
}

