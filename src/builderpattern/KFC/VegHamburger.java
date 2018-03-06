package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public class VegHamburger extends Hamburger {
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public int price() {
        return 10;
    }
}
