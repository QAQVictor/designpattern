package singleton;

/**
 * Created by 李亚卿 on 2018/1/30.
 * <p>
 * 饿汉式
 * 线程安全
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
