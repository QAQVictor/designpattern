package templatepattern;

/**
 * Created by 李亚卿 on 2018/1/31.
 */
public class MakePizza implements CookTemplate{

    @Override
    public void prepareIngredients() {
        System.out.println("准备做披萨的食材");
    }

    @Override
    public void doIt() {
        System.out.println("放烤箱里面");
    }

    @Override
    public void dishesLoading() {
        System.out.println("从烤箱里拿出来就欧了");
    }
}
