
public class EmployeeDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
            System.out.println("ԭ�ۣ�"+dc.getMoney1());
            System.out.println("Ա�������:" + dc.getMoney1() * 0.8);
            
    }

}