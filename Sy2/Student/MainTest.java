package Sy2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("=====欢迎使用学生信息系统=====");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            int choice;
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStu(list);
                    break;
                case 3:
                    modifyStudent(list);
                    break;
                case 4:
                    queryAllStudent(list);
                    break;
                case 5:
                    System.out.println("=====欢迎再次登录=====");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        String sid;
        while (true) {
            System.out.println("input sid:");
            sid = input.next();

            int index = getIndex(sid, list);
            if (index != -1)
                System.out.println("该学号已被占用，请重新输入");
            else break;
        }
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入班号：");
        String cla=input.next();
        System.out.println("请输入性别：");
        String gender=input.next();
        System.out.println("请输入年龄：");
        int age=input.nextInt();
        System.out.println("请输入成绩：");
        double score = input.nextInt();

        Student stu = new Student(sid, name, cla, gender, age, score);
        list.add(stu);
        System.out.println("添加成功");
    }

    private static void deleteStu(ArrayList<Student> list) {
        int index = 0;
        while (true) {
            System.out.println("请输入删除学生学号：");
            String sid = input.next();
            index = getIndex(sid, list);
            if (index == -1)
                System.out.println("您所输入的学号不存在，请重新输入");
            else break;
        }
        list.remove(index);
        System.out.println("删除成功");
    }

    private static void modifyStudent(ArrayList<Student> list) {
        String sid;
        int index;
        while (true) {
            System.out.println("请输入修改学生学号：");
            sid = input.next();
            index = getIndex(sid, list);
            if (index == -1)
                System.out.println("您所输入的学号不存在，请重新输入");
            else break;
        }
        System.out.println("请输入修改学生姓名：");
        String name = input.next();
        System.out.println("请输入修改学生班号：");
        String cla=input.next();
        System.out.println("请输入修改学生性别：");
        String gender=input.next();
        System.out.println("请输入修改学生年龄：");
        int age=input.nextInt();
        System.out.println("请输入修改学生成绩：");
        double score = input.nextInt();
        Student stu = new Student(sid, name, cla, gender, age, score);
        list.set(index, stu);
        System.out.println("修改成功");
    }


    private static void queryAllStudent(ArrayList<Student> list) {
        if (list.size() <= 0) {
            System.out.println("暂无数据可查询，添加数据后再查询");
        } else {
            System.out.println("学号\t\t姓名\t\t\t班号\t\t性别\t\t年龄\t\t成绩");
            for (int index = 0; index < list.size(); index++) {
                Student stu = list.get(index);
                System.out.println(stu.getSid() +"\t\t"+ stu.getName() +"\t\t"+stu.getCla()+"\t\t"+stu.getGender()+"\t\t"+ stu.getAge()+"\t\t"+stu.getScore());
            }
        }
    }


    private static int getIndex(String sid, ArrayList<Student> list) {
        for (int index = 0; index < list.size(); index++) {
            Student stu = list.get(index);
            if (stu.getSid().equals(sid)) return index;
        }
        return -1;
    }
}