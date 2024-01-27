package _05_java_class._09_collection_set;

public class Course {
    private int id;
    private String title;
    public Course(int id, String title){
        this.id=id;
        this.title=title;
    }

//    id, title 값이 Course클래스에 있음
//    id, title 값이  같으면 동일한 hashCode 리턴함
//    참고, hashCode 란?
//    - hashCode : 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
//    - hashCode() 메소드: Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환하는 역할
//      - 클래스에서 hashCode() 재정의 : 객체의 내부 상태를 기반으로 한 고유한 해시 코드를 생성 가능

    @Override
    public int hashCode() {
//        title은 String이므로 hashCode() 메소드 사용하여 int로 바꿔줌
//        id는 원래 int이므로 정수 값의 해시코드에 더하기 연산
        return title.hashCode() + id;
    }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Course target){ // obj가 Course 클래스의 인스턴스인지 확인하기 위해 instanceof 연산자를 사용
//                id는 객체형태가 아닌 기본타입인 int이므로 == 비교하면 됨
//                title은 String으로 wrapper객체이기 때문에 equals로 비교하면 됨
                return target.id == id && target.title.equals(title);
        }else {
                return false;
            }
    }
    @Override
    public String toString(){
        return "Course{" + "id= " + id + '\'' + ", title= " + title + '\'' + "}";
    }
}
