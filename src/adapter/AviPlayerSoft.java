package adapter;

/**
 * @Author: 李亚卿
 * @Date: Created in 22:19 2018/3/26 0026
 * @Description:
 */
public class AviPlayerSoft implements AviPlayer {

    private final String name = "aviplayersoft";

    @Override
    public void playAvi(String fileName) {
        System.out.println(name + " aviplayer:" + fileName);
    }
}
