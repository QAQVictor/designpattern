package factory_pattern.simplefactory;

import factory_pattern.Car;

/**
 * Created by 李亚卿 on 2018/1/29.
 */
public class CarFactory {
    public Car produce(int num) {
        if (num == 1) {
            return new BWM1();
        } else if (num == 2) {
            return new BWM2();
        } else {
            return null;
        }
    }
}
