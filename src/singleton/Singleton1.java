package singleton;

/**
 * Created by 李亚卿 on 2018/1/30.
 * <p>
 * 懒汉式
 * 线程不安全
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1(){

    }

    public static Singleton1 getInstsnce() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
