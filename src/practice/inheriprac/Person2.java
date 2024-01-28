package practice.inheriprac;

public class Person2 {
    //    case1 : 필드가 public인 경우
    public int age;
    public String name;

    //    상속 Step2. super()
//    2-1 부모 클래스가 "기본 생성자"를 갖는 경우 - 매개변수로 아무것도 넘겨받지 않는것을 의미
    public Person2(){
        System.out.println("부모 클래스 Person()생성자가 실행되었습니다.");
    }

    //    2-2 부모 클래스가 "매개변수를 갖는 생성자"를 갖는 경우
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("부모 클래스 Person(name,age) 생성자 실행");
//    }

    public void say() {
        System.out.println("안녕!");
    }

    public void eat(String food) {
        System.out.println(food + "를(을) 먹고 있어요.");
    }

    public static void main(String[] args) {

    }
}
