package _05_java_class._06_interface.Prac;

public class MusicPlayerEx {
    public static void main(String[] args) {
//        Music music = new Mp3Player();
        Music music;
        music = new Mp3Player();
        System.out.println("===MP3 PlAYER===");
        music.play();
        music.stop();

//        Music music =new CDPlayer();

        music = new CDPlayer();
        System.out.println("===CD PlAYER===");
        music.play();
        music.stop();
    }

}
