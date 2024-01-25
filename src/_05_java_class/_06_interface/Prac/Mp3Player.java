package _05_java_class._06_interface.Prac;

public class Mp3Player implements Music {

    @Override
    public void play(){
        System.out.println("MP3 플레이어에서 "+MP3_PLAYER+" 음악을 재생합니다.");
    }

    @Override
    public void stop(){
        System.out.println("MP3 플레이어에서 "+MP3_PLAYER+" 음악을 정지합니다.");
    }
}
