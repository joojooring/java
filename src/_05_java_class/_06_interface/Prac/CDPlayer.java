package _05_java_class._06_interface.Prac;

public class CDPlayer implements Music{

    @Override
    public void play(){
        System.out.println("CD 플레이어에서 "+CD_PLAYER+" 앨범을 재생합니다.");
    }

    @Override
    public void stop(){
        System.out.println("CD 플레이어에서 " + CD_PLAYER+" 앨범을 정지합니다.");
    }
}
