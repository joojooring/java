package _05_java_class._06_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
//        interface도 하나의 타입이므로 변수의 타입으로 사용 가능
//        추상클래스는 new 연산자 불가능했음
//        - interface는 참조타입 (기본타입이 아님) -> null 대입 가능
//        - 자식 객체를 각 각 new연산자 써서 생성가능
        RemoteControl rc; //
//        rc 변수에 Television 객체를 대입
        rc= new Television(); // RemoteContol 타입인 rc에 new Television()과 동일;
//        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();


//        rc변수에 Audio 객체를 대입(교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

    }
}
