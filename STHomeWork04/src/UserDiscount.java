
 
public class  UserDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
        System.out.println("原价："+dc.getMoney4());
            System.out.println("普通用户不打折:" + dc.getMoney4());
            
    }

}