package _05_java_class._06_interface.PracCorrect;

public class Mp3Player implements Music{
    private String song;

    //    생성자에서 초기화!!
    public Mp3Player(String song){
        this.song=song;
    }

    @Override
    public void play(){
        System.out.println("MP3 플레이어에서 "+song+"앨범 재생합니다.");
    }

    @Override
    public void stop(){
        System.out.println("MP3 플레이어에서 "+song+"앨범 정지합니다.");
    }
}
