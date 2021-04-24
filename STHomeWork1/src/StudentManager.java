public class StudentManager {
    private String name;
    private String sex;
    private String brithday;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getSex() {
        return sex;
    }
 
    public void setSex(String sex) {
        this.sex = sex;
    }
 
    public StudentManager() {
    }
 
    public StudentManager(String name, String sex, String brithday) {
        this.name = name;
        this.sex = sex;
        this.brithday = brithday;
    }
 
    public String getBrithday() {
        return brithday;
    }
 
    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
 
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", brithday='" + brithday + '\'' +
                '}';
    }
}