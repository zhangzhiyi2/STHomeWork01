 

public class  VipDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
            System.out.println("ԭ�ۣ�"+dc.getMoney3());
            System.out.println("VIP�û�������:" + dc.getMoney3() * 0.6);
            
    }

}