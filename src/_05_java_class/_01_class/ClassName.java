package _05_java_class._01_class;

public class ClassName {
//    필드(변수)
    public int number; // 필드(변수)
    public String name ; // 필드(변수)

//    메소드(함수)

//    메소드 안에 생성자가 존재 (클래스 네임과 생성자 네임은 동일하게)
//    -> 생성자명 = 클래스명
    public ClassName(){

    }
    public void textMethod(){
        System.out.println("text method!!");
    }

//    main메소드
public static void main(String[] args) {
//    객체 생성 (인스턴스화) // 클래스명 객체명 = new 클래스명();
    ClassName test = new ClassName();//    클래스네임이라는 객체를 가진 text객체가 생성된거임

//  위에서 만들어둔 필드, 객체를 사용하려면
    test.textMethod();
    System.out.println(test.name); //null
    System.out.println(test.number); //0

    }
}
