 

public class  VipDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
            System.out.println("原价："+dc.getMoney3());
            System.out.println("VIP用户打六折:" + dc.getMoney3() * 0.6);
            
    }

}