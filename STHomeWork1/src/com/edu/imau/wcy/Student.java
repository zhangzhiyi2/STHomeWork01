package com.edu.imau.wcy;

public class Student {
    private String stubirthday;//����
    private String name;//����
    private boolean gender=true;//�Ա�
    private int stuNum;//ѧ��
 
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
        if(gender) return "��";
         return "Ů";
        
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
