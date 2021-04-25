package com.edu.imau.wcy;

public class Student {
    private String stubirthday;//生日
    private String name;//姓名
    private boolean gender=true;//性别
    private int stuNum;//学号
 
    public Student() {
        super();
    }
    public String getStuBirthday() {
        return stubirthday;
    }
    public void setStuBirthday(String stubirthday) {
        this.stubirthday = stubirthday;
    }
    
    
    public String getGender() {
        if(gender) return "男";
         return "女";
        
    }
    public boolean setGender(boolean gender) {
        return gender;
    }
    
    
    public int getStuNum() {
        return stuNum;
    }
    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}
