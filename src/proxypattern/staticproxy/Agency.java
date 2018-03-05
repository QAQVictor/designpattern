package proxypattern.staticproxy;

/**
 * Created by 李亚卿 on 2018/3/5.
 */
public class Agency implements BuyHouse{

    private Buyer buyer;

    public Agency(Buyer buyer){
        this.buyer=buyer;
    }

    @Override
    public void buyHouse() {
        seeHouse();
        buyer.buyHouse();
        doFormality();
    }

    public void seeHouse(){
        System.out.println("中介帮忙看房子");
    }
    public void doFormality(){
        System.out.println("中介帮忙做手续");
    }
    public static void main(String[] args){
        Buyer buyer=new Buyer();
        Agency agency=new Agency(buyer);
        agency.buyHouse();
    }
}
