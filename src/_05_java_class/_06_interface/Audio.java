package _05_java_class._06_interface;

import java.rmi.Remote;

//부모클래스가 interface면 자식클래스는 extends가 아닌 implements로 받음
public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public  void turnOff(){
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
//        인터페이스의 상수필드를 이용해서 volume의 필드의 값을 제한할거임
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }else{
            this.volume=volume;
        }
        System.out.println("현재 오디오의 볼륨은 ? : "+ this.volume);
    }
}
