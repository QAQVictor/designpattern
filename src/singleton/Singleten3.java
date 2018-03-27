package singleton;

/**
 * Created by 李亚卿 on 2018/1/30.
 * <p>
 * 懒汉式（双重校验锁）
 * 线程安全
 */
public class Singleten3 {
    private volatile static Singleten3 singleten3 = null;

    private Singleten3() {

    }

    public static Singleten3 getInstance() {
        if (singleten3 == null) {
            synchronized (Singleten3.class) {
                if (singleten3 == null) {
                    singleten3 = new Singleten3();
                }
            }
        }
        return singleten3;
    }

}
