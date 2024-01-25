package _05_java_class._05_abstract;

//추상 클래스
// class 앞에 abstract 키워드 적어주면 됨

//오버라이드랑 다른건 : 오버라이드는 자식에선 선택사항인데 추상은 반드시 구현해야 됨
public abstract class Shape {
//    1.필드 선언
    String color;

//    2. 생성자 선언 및 초기화
    public Shape(String color){
        this.color=color;
    }

//    3.추상 메소드 선언
//    - ( 선언만 있고, 구현되지 않는 메소드!!)
//    - 중괄호 없음
//    - 구현 내용이 자식 클래스마다 다른 경우 추상 메소드 사용
//    - 메소드 앞에 abstract 붙이면 됨
    abstract void draw();

//    3-1 ) 추상클래스에서 일반 메소드도 사용 가능!
    void start(){
        System.out.println("도형을 그려보자");
    }

//    4. getter 생성
    String getColor(){
        return color;
    }
}
