package _05_java_class._06_interface.PracCorrect;

public class MusicPlayerEx {
    public static void main(String[] args) {

//        MP3 객체 생성 및 음악 재생
        Mp3Player mp3Player = new Mp3Player("아이유 블루밍");
        mp3Player.play();
        mp3Player.stop();

        CdPlayer cdPlayer = new CdPlayer("아이유 책갈피");
        cdPlayer.play();
        cdPlayer.stop();
    }
}
