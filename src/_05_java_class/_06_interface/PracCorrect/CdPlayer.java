package _05_java_class._06_interface.PracCorrect;

public class CdPlayer implements Music{
    private String album;

//    생성자에서 초기화!!
    public CdPlayer(String album){
        this.album=album;
    }

    @Override
    public void play(){
        System.out.println("CD 플레이어에서 "+album+"앨범 재생합니다.");
    }

    @Override
    public void stop(){
        System.out.println("CD 플레이어에서 "+album+"앨범 정지합니다.");
    }
}
