package adapter;

/**
 * @Author: 李亚卿
 * @Date: Created in 22:18 2018/3/26 0026
 * @Description:
 */
public class Mp4PlayerSoft implements Mp4Player {

    private final String name = "mp4playersoft";

    @Override
    public void playMP4(String fileName) {
        System.out.println(name+" mp4player:" + fileName);
    }
}
