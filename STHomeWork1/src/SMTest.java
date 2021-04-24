import java.sql.SQLException;
import java.util.Scanner;

public class SMTest {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入名字：");
        String names=sc.next();
        System.out.println("请输入性别：");
        String sexs=sc.next();
        System.out.println("请输入生日：");
        String bris=sc.next();
        StudentManager s1=new StudentManager(names,sexs,bris);
        add dl1=new add();
        dl1.Insert(s1);
        dl1.Select();
 
        System.out.println("请输入id：");
        int id=sc.nextInt();
        System.out.println("请输入名字：");
        String name=sc.next();
        System.out.println("请输入性别：");
        String sex=sc.next();
        System.out.println("请输入生日：");
        String bri=sc.next();
        StudentManager s2=new StudentManager(name,sex,bri);
        add dl2=new add();
        dl2.Update(id,s2);
        dl2.Select();
 
        System.out.println("请输入您要删除的对象姓名：");
        String namess=sc.next();
        add dl3=new add();
        dl3.Delete(namess);
        dl3.Select();
    }
}