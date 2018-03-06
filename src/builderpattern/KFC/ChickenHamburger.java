package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public class ChickenHamburger extends Hamburger{
    @Override
    public String name() {
        return "chicken hamburger";
    }

    @Override
    public int price() {
        return 15;
    }
}
