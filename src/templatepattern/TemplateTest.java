package templatepattern;

/**
 * Created by 李亚卿 on 2018/1/31.
 */
public class TemplateTest {
    public static void main(String[] args) {
/*        CookTemplate scrambleEggs=new ScrambledEggs();
        CookTemplate makePizza=new MakePizza();
        scrambleEggs.prepareIngredients();
        scrambleEggs.doit();
        scrambleEggs.dishesLoading();


        makePizza.prepareIngredients();
        makePizza.doIt();
        makePizza.dishesLoading();*/

        CookTemplate1 scrambleEggs1 = new ScrambledEggs1();
        CookTemplate1 makePizza1 = new MakePizza1();

        scrambleEggs1.cook();

        makePizza1.cook();
    }
}
