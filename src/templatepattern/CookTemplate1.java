package templatepattern;

/**
 * Created by 李亚卿 on 2018/1/31.
 */
public abstract class CookTemplate1 {

    protected abstract void prepareIngredients();
    protected abstract void doIt();
    protected abstract void dishesLoading();

    public void cook(){
        prepareIngredients();
        doIt();
        dishesLoading();
    }
}
