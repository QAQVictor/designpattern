package proxypattern.staticproxy;

/**
 * Created by 李亚卿 on 2018/3/5.
 */
public class Buyer implements BuyHouse{
    @Override
    public void buyHouse() {
        System.out.println("买房子");
    }
}
