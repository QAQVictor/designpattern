package adapter;

/**
 * @Author: 李亚卿
 * @Date: Created in 22:21 2018/3/26 0026
 * @Description: 类适配器
 */
public class PlayerAdapter extends Mp4PlayerSoft implements AviPlayer {

    private final String name = "adapter";

    @Override
    public void playAvi(String fileName) {
        System.out.println(name + " play:" + fileName);
    }

    public void play(String fileName, String type) {
        if (type.equals("mp4")) {
            this.playMP4(fileName);
        } else if (type.equals("avi")) {
            this.playAvi(fileName);
        }else{

        }
    }

    public static void main(String[] args) {
        Mp4Player mp4Player = new Mp4PlayerSoft();
        mp4Player.playMP4("mp4");
        AviPlayer aviPlayer = new AviPlayerSoft();
        aviPlayer.playAvi("avi");
        PlayerAdapter playerAdapter = new PlayerAdapter();
        playerAdapter.playMP4("mp4");
        playerAdapter.play("mp4", "mp4");
        playerAdapter.play("avi", "avi");
        playerAdapter.playAvi("avi");
    }

}
