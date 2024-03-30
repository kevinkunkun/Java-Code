package Sy7;

import java.util.HashSet;
import java.util.Objects;

class Person1{
    private String name;
    private String telephonenumber;
    private String massage;

    public Person1(String name, String telephonenumber, String massage) {
        this.name = name;
        this.telephonenumber = telephonenumber;
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", telephonenumber='" + telephonenumber + '\'' +
                ", massage='" + massage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return Objects.equals(name, person.name) && Objects.equals(telephonenumber, person.telephonenumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telephonenumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}

public class HashSetList {
    public static void main(String[] args) {
        HashSet<Person1> temp=new HashSet<Person1>(8);
        temp.add(new Person1("张三","0812-3333001","我是张三！"));
        temp.add(new Person1("张三","0812-3333002","我叫张三。但不是第一个张三！！"));
        temp.add(new Person1("李四","0812-3333002","我是李四，不过我用的张三的电话！！"));
        temp.add(new Person1("李四","0812-3333002","我不是李四！"));
        temp.add(new Person1("王五","0812-3333003","我是王五！"));
        for(Person1 s:temp){
            System.out.println(s);
        }
    }
}
