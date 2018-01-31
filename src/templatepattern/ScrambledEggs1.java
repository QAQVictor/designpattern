package templatepattern;

/**
 * Created by 李亚卿 on 2018/1/31.
 */
public class ScrambledEggs1 extends CookTemplate1 {
    @Override
    public void prepareIngredients() {
        System.out.println("准备鸡蛋");
    }

    @Override
    public void doIt() {
        System.out.println("炒鸡蛋");
    }

    @Override
    public void dishesLoading() {
        System.out.println("炒好的鸡蛋放盘子里");
    }
}
