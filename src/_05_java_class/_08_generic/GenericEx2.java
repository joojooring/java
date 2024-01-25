package _05_java_class._08_generic;

//제한된 타입 파라미터
//참고. Number 클래스
// - Java의 모든 숫자형식의 부모 클래스

//제네릭 제한
// T에 제한을 걸어서 Number를 상속한 클래스만 허용
class Box <T extends Number> {
    private T item;
    public void setItem(T item){
        this.item = item;
    }
}

interface  Movable {
    void move();
}

class Car implements Movable{
    @Override
    public void move(){
        System.out.println("자동차 출발~!");
    }
}
class Container<T extends  Movable>{
    private T item;

//    item을 추가할 수 있게끔 생성자 생성
    public Container(T item){
        this.item = item;
    }
    public void makeItMove(){
        item.move();
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
//        Box<String > stringBox = new Box<String>(); //위에서 number로 제한했기 때문에 error!
        Box<Double> doubleBox = new Box<>();
//        Box<Integer> integerBox = new Box<>();


//        /////////////
//        case2
        Container<Car> carContainer = new Container<>(new Car());

    }
}
