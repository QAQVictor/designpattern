package factory_pattern.simplefactory;

import factory_pattern.Car;

/**
 * Created by 李亚卿 on 2018/1/29.
 */
public class BWM1 implements Car {

    @Override
    public void run() {
        System.out.println("BWM1 is running!");
    }
}
