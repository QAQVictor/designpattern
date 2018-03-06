package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public abstract class Drink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
