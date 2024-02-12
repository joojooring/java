package practice.interfacePrac;

public class CdPlayer implements Music {
    private String album;

    public CdPlayer(String album){
        this.album=album;
    }

    @Override
    public void play(){
        System.out.println("Cd 플레이어에서 " + album+" 앨범 재생");
    }

    @Override
    public void stop(){
        System.out.println("Cd 플레이어에서 " + album+" 앨범 정지");
    }
}
