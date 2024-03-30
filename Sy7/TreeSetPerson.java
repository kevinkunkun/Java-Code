package Sy7;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class TreeSetPerson {
    public static void main(String[] args) {
        TreeSet<Person>temp=new TreeSet<>(new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                if(!(o1 instanceof Person ||o2 instanceof Person))
                    throw new RuntimeException(("不是学生！"));
                if(o1.getAge()>o2.getAge())
                    return 1;
                if (o1==null||o2==null) {
                    return 0;
                }
                if(o1.getAge()==o2.getAge())
                    return o1.getName().compareTo((o2.getName()));
                return -1;
            }
        });
        temp.add(new Person("张三",18));
        temp.add(new Person("张三",19));
        temp.add(new Person("张三",26));
        temp.add(new Person("李四",21));
        temp.add(new Person("李四",21));
        temp.add(new Person("王五",21));
        temp.add(new Person("王五",26));
        for (Person s:temp) {
            System.out.println(s);
        }
    }

}
