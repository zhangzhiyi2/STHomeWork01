import java.sql.SQLException;
import java.util.Scanner;

public class SMTest {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("���������֣�");
        String names=sc.next();
        System.out.println("�������Ա�");
        String sexs=sc.next();
        System.out.println("���������գ�");
        String bris=sc.next();
        StudentManager s1=new StudentManager(names,sexs,bris);
        add dl1=new add();
        dl1.Insert(s1);
        dl1.Select();
 
        System.out.println("������id��");
        int id=sc.nextInt();
        System.out.println("���������֣�");
        String name=sc.next();
        System.out.println("�������Ա�");
        String sex=sc.next();
        System.out.println("���������գ�");
        String bri=sc.next();
        StudentManager s2=new StudentManager(name,sex,bri);
        add dl2=new add();
        dl2.Update(id,s2);
        dl2.Select();
 
        System.out.println("��������Ҫɾ���Ķ���������");
        String namess=sc.next();
        add dl3=new add();
        dl3.Delete(namess);
        dl3.Select();
    }
}