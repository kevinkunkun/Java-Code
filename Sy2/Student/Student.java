package Sy2.Student;

public class Student {
    private String sid;
    private String cla;
    private String gender;
    private int age;
    private  String name;
    private  double score;
    public  Student(){

    }
public Student(String sid, String name,String cla,String gender,int age,double score){
        this.sid=sid;
        this.cla=cla;
        this.gender=gender;
        this.age=age;
        this.name=name;
        this.score=score;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return sid+","+cla+","+gender+","+age+","+name+","+score;
    }
}

