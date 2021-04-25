package com.edu.imau.wcy;
import java.util.*;

public class StudentManager {
 
		static Student[] Student=new Student[100];
		static  int number=0;
		static Scanner scanner=new Scanner(System.in);
		public void app(){
 
  int choice;
 
  System.out.println("菜单");
  while(true){
  System.out.println("1.插入");
  System.out.println("2.查找");
  System.out.println("3.删除");
  System.out.println("4.修改");
  System.out.println("5.输出");  
  System.out.println("6.退出");
  System.out.println("请输入你要进行的操作");
  choice=scanner.nextInt();
  if(choice==6)break;
  switch(choice){
  case 1:     add(); break;//插入学生信息
  case 2:     query();break;//查询学生信息
  case 3:     delete();break;//删除学生信息
  case 4:     change();break;//修改学生信息
  case 5:     shuchu();break;//输出学生信息

  }       
} 
}

static void add(){//1插入
  while(true){
  System.out.println("点击任意键继续添加学生信息，停止添加输入0");
  if(scanner.nextInt()==0)break;
  System.out.println("请输入该学生的学号，姓名，出生日期，性别");
  Student[number]=new Student();
  Student[number].setStuNum(scanner.nextInt());
  Student[number].setName(scanner.next());
  Student[number].setStuBirthday(scanner.next());
  Student[number].setGender(scanner.hasNext());
  int j;
  Student temp=new Student();
  for(int i=0;i<number;i++)
  {
      for(j=i+1;j<number;j++)
      if(Student[i].getStuNum()>Student[j].getStuNum())
      {temp=Student[i];Student[i]=Student[j];Student[j]=temp;}
  }
  number++;
  System.out.println("添加成功");
  }
 }

static void query(){//2查找
    System.out.println("请输入要查询的学生姓名");
     String Stunumber=scanner.next();
     int i;
      for(i=0;i<number;i++)
      {
          if(Stunumber.equals(Student[i].getName())){
              System.out.println(" 学号             姓名                          出生日期              性别            ");
              System.out.println(Student[i].getStuNum()+"\t"+Student[i].getName()+"\t"+Student[i].getStuBirthday()+Student[i].getGender());
              System.out.println("                                              ");
          }
      } 
      if(number==i)System.out.println("没有这个人！");
}

static void delete(){//3删除
	  System.out.println("请输入要删除信息的学生姓名");
	  String Stuname=scanner.next();
	  int i;
	      for( i=0;i<number;i++)
	      if(Stuname.equals(Student[i].getName()))break;
	      if(number==i)System.out.println("没有这个人！");
	  for(;i<number-1;i++)
	      Student[i]=Student[i+1];
	       number--;
	
	}
 


static void change(){//4修改
  System.out.println("请输入要修改信息的学生姓名");
  String Stuname=scanner.next();
  for(int i=0;i<number;i++)
  {
      if(Stuname.equals(Student[i].getName()))
      {System.out.println("请输入要修改的学生的信息,学号，姓名，出生日期，年龄");
          Student[i].setStuNum(scanner.nextInt());
          Student[i].setName(scanner.next());
          Student[i].setStuBirthday(scanner.next());
          Student[i].setGender(scanner.hasNext());
          break;
      }
      if(number==i)System.out.println("没有找到！！！");
 }
}






static void shuchu(){//5输出

    System.out.println(" 学号             姓名                        出生日期              性别             ");
    int j;
    Student temp=new Student();
    for(int i=0;i<number;i++)
    {
        for(j=i+1;j<number;j++)
        if(Student[i].getStuNum()>Student[j].getStuNum())
        {temp=Student[i];Student[i]=Student[j];Student[j]=temp;}
    }
    number++;
    System.out.println("添加成功");
    for(int i=0;i<number;i++)
    System.out.println(Student[i].getStuNum()+"\t"+Student[i].getName()+"\t"+Student[i].getStuBirthday()+"\t"+Student[i].getGender());
     System.out.println("                                        ");
   System.out.println();
}

}
 
