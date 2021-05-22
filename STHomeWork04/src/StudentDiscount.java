public class StudentDiscount implements Discountor {

    // 每购买满100元立减10

    public void discount(Discountable money) {
        DC dc = (DC)money;
        double n;
        int m=0;
        n=dc.getMoney2();
        System.out.println("原价："+n); 
        while(n >=100){
        	n=n-100;
        	m++;	
        }
        n=dc.getMoney2();
        n=n-10*m;
        System.out.println("学生每满100减10元:" + n);
    }

}