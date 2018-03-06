package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public class CocaCola extends Drink{
    @Override
    public String name() {
        return "coca cola";
    }

    @Override
    public int price() {
        return 5;
    }
}
