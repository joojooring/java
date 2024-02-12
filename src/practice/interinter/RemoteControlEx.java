package practice.interinter;

public class RemoteControlEx {
    public static void main(String[] args) {
//        interface도 하나의 타입이므로 변수의 타입으로 사용 가능
//        interface는 참조 타입. (기본타입이 아니니까) -> null 대입 가능
//        오디오객체랑 텔레비전 객체 따로 만들어줘도 됨
        RemoteControl rc; // RemoteControl의 변수를 만들어줌

//        null이었던 rc 변수에 Television 객체를 대입
        rc  = new Television();

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();

        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();
    }
}
