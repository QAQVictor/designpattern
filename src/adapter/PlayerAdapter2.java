package adapter;

/**
 * @Author: 李亚卿
 * @Date: Created in 22:32 2018/3/26 0026
 * @Description: 对象适配器
 */
public class PlayerAdapter2 implements AviPlayer {

    private final String name = "adapter2";

    private Mp4Player mp4Player = new Mp4PlayerSoft();

    @Override
    public void playAvi(String fileName) {
        System.out.println(name + " play:" + fileName);
    }

    public void play(String fileName, String type) {
        if (type.equals("mp4")) {
            mp4Player.playMP4(fileName);
        } else if (type.equals("avi")) {
            this.playAvi(fileName);
        }
    }

    public static void main(String[] args) {
        PlayerAdapter2 playerAdapter2 = new PlayerAdapter2();
        playerAdapter2.play("mp4", "mp4");
        playerAdapter2.play("avi", "avi");
    }
}
