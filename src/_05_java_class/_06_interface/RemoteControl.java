package _05_java_class._06_interface;

// 인터페이스로 선언!!!
//- class 대신 interface 쓰면 됨
//- 인터페이스는 필드로 상수만 쓸 수 있음 public static final (public static final은 생략 가능
public interface RemoteControl {
//    상수 필드
//    - 인터페이스에 선언된 필드는 모두 " public static final" 특성을 갖음
//    - 생략하더라도 compile과정에서 자동으로 붙게됨
//    - 상수명은 모두 대문자로 작성, 여러단어로 연결되면 _언더바로 연결
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;


//    추상 메서드 선언 : abstract을 붙이지 않아도 자동으로 추상메소드로 인식됨
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

}
