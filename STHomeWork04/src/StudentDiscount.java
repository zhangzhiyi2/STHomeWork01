public class StudentDiscount implements Discountor {

    // ÿ������100Ԫ����10

    public void discount(Discountable money) {
        DC dc = (DC)money;
        double n;
        int m=0;
        n=dc.getMoney2();
        System.out.println("ԭ�ۣ�"+n); 
        while(n >=100){
        	n=n-100;
        	m++;	
        }
        n=dc.getMoney2();
        n=n-10*m;
        System.out.println("ѧ��ÿ��100��10Ԫ:" + n);
    }

}