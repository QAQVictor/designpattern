package proxypattern.dynamicproxy;

import proxypattern.staticproxy.BuyHouse;
import proxypattern.staticproxy.Buyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 李亚卿 on 2018/3/5.
 */
public class Agency implements InvocationHandler {

    private Object target;

    public Agency(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("看房子");
        Object result= method.invoke(target, args);
        System.out.println("办手续");
        return result;
    }

    public static void main(String[] args){
        Buyer buyer=new Buyer();
        BuyHouse agency= (BuyHouse) Proxy.newProxyInstance(buyer.getClass().getClassLoader(),buyer.getClass().getInterfaces(),new Agency(buyer));
        System.out.println(agency.getClass());
        agency.buyHouse();
    }
}
