package factory_pattern.factory;

import factory_pattern.Car;

/**
 * Created by 李亚卿 on 2018/1/29.
 */
public class FactoryTest {
    public static void main(String[] args) {
        CarFactory BWMFactory = new BWMFactory();
        Car BWMCar = BWMFactory.produce();
        BWMCar.run();
        CarFactory BenzFactory = new BenzFactory();
        Car BenzCar = BenzFactory.produce();
        BenzCar.run();
    }
}
