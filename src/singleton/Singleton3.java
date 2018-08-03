package singleton;

/**
 * Created by 李亚卿 on 2018/1/30.
 * <p>
 * 懒汉式（双重校验锁）
 * 线程安全
 */
public class Singleton3 {
    private volatile static Singleton3 singleton3 = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

}
