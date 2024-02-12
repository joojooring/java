package practice.interinter;

//interface 선언 class 대신 interface로 작성
public interface RemoteControl {
//    추상메서드 선언
    public void turnOn();
    public void turnOff();

    public void setVolume(int volume);

//    상수 필드
//    - 인터페이스에 선언된 필드는 모두 public static final 상수임!
//    - 생략하더라도 컴파일시 자동으로 붙음
//    - 상수명 대문자로 작성, 여러 단어로 연결시 언더바(_)
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}
