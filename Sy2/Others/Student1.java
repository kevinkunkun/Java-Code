package Sy2.Others;

public class Student1 {
        public static void main(String[] args) {
            Student_3 stu = new Student_3();

            stu.setName("鹿晗");
            stu.setAge(20);
            stu.setMale(true);

            System.out.println("姓名：" + stu.getName());
            System.out.println("年龄：" + stu.getAge());
            System.out.println("是不是男生：" + stu.isMale());
            System.out.println(stu);

        }
    }
    class Student_3{
        @Override
        public String toString() {
            return
                    "我叫 '" + name + '\'' +
                            ", 年龄=" + age ;
        }

        private String name; // 姓名
        private int age; // 年龄
        private boolean male; // 是不是男生

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
            if (age>=6&&age<=70){
                this.age = age;
            }else {
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
