
 
public class  UserDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
        System.out.println("ԭ�ۣ�"+dc.getMoney4());
            System.out.println("��ͨ�û�������:" + dc.getMoney4());
            
    }

}