public class DC implements Discountable {
    
   
	private double money1;
    //员工折扣
    private double money2;
    //学生折扣
    private double money3;
    //VIP折扣
    private double money4;
    //普通用户，无折扣

    //private Discountor money = new EmployeeDiscount();
    //private Discountor money = new StudentDiscount();
    //private Discountor money = new VipDiscount();
    private Discountor money = new UserDiscount();
    
    public double getMoney1() {
        return money1;
    }
    public void setMoney1(double money1) {
        this.money1 = money1;
    }
    
    public double getMoney2() {
        return money2;
    }
    public void setMoney2(double money2) {
        this.money2 = money2;
    }
    
    public double getMoney3() {
        return money3;
    }
    public void setMoney3(double money3) {
        this.money3 = money3;
    }
    
    public double getMoney4() {
        return money4;
    }
    public void setMoney4(double money4) {
        this.money4 = money4;
    }
    public DC(double money1, double money2,double money3,double money4) {
        super();
        this.money1 = money1;
        this.money2 = money2;
        this.money3 = money3;
        this.money4 = money4;
    }
    
    @Override
    public void discountSell() {
        money.discount(this);
    }
    
    
}