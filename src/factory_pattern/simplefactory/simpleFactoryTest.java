package factory_pattern.simplefactory;

import factory_pattern.Car;

/**
 * Created by 李亚卿 on 2018/1/29.
 */
public class simpleFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.produce(1);
        car1.run();
        Car car2 = carFactory.produce(2);
        car2.run();
    }
}
