
public class EmployeeDiscount implements Discountor {

    
    public void discount(Discountable money) {
        DC dc = (DC)money;
            System.out.println("原价："+dc.getMoney1());
            System.out.println("员工打八折:" + dc.getMoney1() * 0.8);
            
    }

}