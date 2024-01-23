package _05_java_class._04_inheritance;

//자식이니까 class에서 extends 부모클래스 넣어주면 됨
public class Student extends Person {
//    case1 : 필드가 public인 경우

//    자식클래스의 필드
//    public String campus;


//    2-1. 부모 클래스가 기본 생성자
//    public Student(String name, int age){
////        super(); // 생략되어있음(부모클래스를 가져오는거_컴파일시 자동생성)
//        this.age = age;
//        this.name = name;
//    }

//    2-2. 부모 클래스가 매개변수를 갖는 생성자
//    public Student(String name, int age){
//        super(name,age); // 부모 생성자에서 가져올거니까 super에서만 넣으면 됨
//        System.out.println("자식 클래스 Student(name, age) 생성자 실행");
//    }

//    자식클래스의 필드에 해당하는 생성자
//    public void setCampus(String campus){
//        this.campus = campus;
//        System.out.println(campus + "캠퍼스에서 공부 중");
//    }





//    /////////////////////////////Case2 자식필드도 private인 경우
    private String campus;

    public Student(String name, int age){
        // private 일때는 부모로부터 상속받은 필드를 setter로 넣어줄 수 있음
        setAge(age);
        setName(name);
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부 중");
    }


//    메소드 오버라이딩( @Override)
//    - 부모 클래스의 메소드를 자식 클래스에서 재정의
//    메소드 이름, 매개변수 타입 및 개수, 리턴 타입 등 모든 것 동일하게
    @Override // 어노테이션이라고 하고 생략 가능!

    public void say(){
        System.out.println("오버라이드 됐니!!! 부모꺼 받지 말아라");
    }

}
