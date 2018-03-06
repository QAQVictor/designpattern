package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public class Pepsi extends Drink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public int price() {
        return 6;
    }
}
