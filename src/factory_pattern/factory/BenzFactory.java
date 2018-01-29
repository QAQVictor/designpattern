package factory_pattern.factory;

import factory_pattern.Car;

/**
 * Created by 李亚卿 on 2018/1/29.
 */
public class BenzFactory extends CarFactory{
    @Override
    public Car produce() {
        return new Benz();
    }
}
