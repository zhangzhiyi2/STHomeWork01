package com.edu.imau.wcy;

import java.util.Scanner;

//import java.util.*;

public class StudentManager {
 
	static Student[] Student=new Student[100];
	static  int number=0;
	static Scanner scanner=new Scanner(System.in);
	public void app(){
		
		int choice;
		System.out.println("�˵�");
		while(true){
			
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.ɾ��");
			System.out.println("4.�޸�");
			System.out.println("5.���");  
			System.out.println("6.�˳�");
			System.out.println("��������Ҫ���еĲ���");
			
			choice=scanner.nextInt();
			if(choice==6)break;
			switch(choice){
	  			case 1:     add(); break;//4����ѧ����Ϣ
	  			case 2:     query();break;//4��ѯѧ����Ϣ
	  			case 3:     delete();break;//4ɾ��ѧ����Ϣ
	  			case 4:     change();break;//4�޸�ѧ����Ϣ
	  			case 5:     shuchu();break;//4���ѧ����Ϣ
	  			default:    break;
	  			}       
			} 
		}

static void add(){//8 1����
	while(true){
	System.out.println("���������������ѧ����Ϣ��ֹͣ�������0");
    if(scanner.nextInt()==0)break;
    System.out.println("�������ѧ����ѧ�ţ��������������ڣ��Ա�");
    Student[number]=new Student();
    Student[number].setStuNum(scanner.nextInt());
    Student[number].setName(scanner.next());
    Student[number].setStuBirthday(scanner.next());
    Student[number].setGender(scanner.hasNext());
    
    int j;
    Student temp=new Student();
    for(int i=0;i<number;i++){
    	for(j=i+1;j<number;j++)
    		if(Student[i].getStuNum()>Student[j].getStuNum()){
    			temp=Student[i];Student[i]=Student[j];Student[j]=temp;
    			}
    }
    number++;
    System.out.println("��ӳɹ�");
    }
}

static void query(){//8 2����
     System.out.println("������Ҫ��ѯ��ѧ������");
     String Stunumber=scanner.next();
     int i;
      for(i=0;i<number;i++)
      {
          if(Stunumber==(Student[i].getName())){//7��== ���.equals
              System.out.println(" ѧ��             ����                          ��������              �Ա�            ");
              System.out.println(Student[i].getStuNum()+"\t"+Student[i].getName()+"\t"+Student[i].getStuBirthday()+Student[i].getGender());
              System.out.println("                                              ");
          }
      } 
      if(number==i)System.out.println("û������ˣ�");
}

static void delete(){//8 3ɾ��
	  System.out.println("������Ҫɾ����Ϣ��ѧ������");
	  String Stuname=scanner.next();
	  int i;
	      for( i=0;i<number;i++)
	      if(Stuname==(Student[i].getName()))break;//7��== ���.equals
	      if(number==i)System.out.println("û������ˣ�");
	  for(;i<number-1;i++)
	      Student[i]=Student[i+1];
	       number--;
}
 
static void change(){//8 4�޸�
   System.out.println("������Ҫ�޸���Ϣ��ѧ������");
   String Stuname=scanner.next();
   for(int i=0;i<number;i++)
   {
      if(Stuname==(Student[i].getName()))//7��== ���.equals
      {System.out.println("������Ҫ�޸ĵ�ѧ������Ϣ,ѧ�ţ��������������ڣ�����");
          Student[i].setStuNum(scanner.nextInt());
          Student[i].setName(scanner.next());
          Student[i].setStuBirthday(scanner.next());
          Student[i].setGender(scanner.hasNext());
          break;
      }
      if(number==i)System.out.println("û���ҵ�������");
 }
}

static void shuchu(){//5���

    System.out.println(" ѧ��             ����                        ��������              �Ա�             ");
    int j;
    Student temp=new Student();
    for(int i=0;i<number;i++)
    {
        for(j=i+1;j<number;j++)
        if(Student[i].getStuNum()>Student[j].getStuNum())
        {temp=Student[i];Student[i]=Student[j];Student[j]=temp;}
    }
    number++;
    System.out.println("��ӳɹ�");
    for(int i=0;i<number;i++)
    System.out.println(Student[i].getStuNum()+"\t"+Student[i].getName()+"\t"+Student[i].getStuBirthday()+"\t"+Student[i].getGender());
    System.out.println("                                        ");
    System.out.println();
    }
}
 
