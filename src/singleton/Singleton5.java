package singleton;

/**
 * @Author: 李亚卿
 * @Date: Created in 13:52 2018/8/9 0009
 * @Description:
 */
public enum  Singleton5 {
    SINGLETON_5;
    int i=0;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void IncI(){
        i++;
    }

    public static void main(String[] args) {
        Singleton5.SINGLETON_5.IncI();
        Singleton5 singleton5=Singleton5.SINGLETON_5;
        Singleton5 singleton51=Singleton5.SINGLETON_5;

        System.out.println(singleton5==singleton51);

        singleton5.IncI();

        singleton51.IncI();
    }
}
