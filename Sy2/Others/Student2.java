package Sy2.Others;

public class Student2 {
    public static void main(String[] args) {
        Student_31 stu = new Student_31("张三", 18, false,'女');

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是男生：" + stu.isMale());
        System.out.println(stu);

    }
}

class Student_31 {
    public Student_31(String name, int age, boolean male, char sex) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", sex=" + sex;
    }

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 是不是男生
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 6 && age <= 70) {
            this.age = age;
        } else {
            System.out.println("年龄非法");
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}