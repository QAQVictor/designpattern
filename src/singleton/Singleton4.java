package singleton;

/**
 * @Author: 李亚卿
 * @Date: Created in 15:48 2018/8/3 0003
 * @Description:
 */
public class Singleton4 {

    private enum Singleton{
        SINGLETON;

        private int i=0;
    }
    public static Singleton getInstance(){
        return Singleton.SINGLETON;
    }

    public static void main(String[] args) {
        Singleton4 singleton4=new Singleton4();
        Singleton4 singleton41=new Singleton4();
        singleton4.getInstance().i++;
        System.out.println(singleton4.getInstance().i +" "+singleton41.getInstance().i);
    }
}
