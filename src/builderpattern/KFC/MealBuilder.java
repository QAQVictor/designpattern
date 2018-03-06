package builderpattern.KFC;

/**
 * Created by 李亚卿 on 2018/3/6.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegHamburger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNoVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenHamburger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal noVegMeal = mealBuilder.prepareNoVegMeal();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        noVegMeal.showItems();
        System.out.println("Total:" + noVegMeal.getCost());
    }
}
