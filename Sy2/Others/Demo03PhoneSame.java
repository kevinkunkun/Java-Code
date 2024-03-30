package Sy2.Others;

public class Demo03PhoneSame {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand); //
        System.out.println(one.price); //
        System.out.println(one.color); //
        System.out.println("=========");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand); //
        System.out.println(one.price); //
        System.out.println(one.color); //
        System.out.println("=========");

        one.call("乔布斯"); //
        one.sendMessage(); //
        System.out.println("=========");

        // 将one当中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(two.brand); //
        System.out.println(two.price); //
        System.out.println(two.color); //
        System.out.println("=========");

        two.brand = "华为";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand); //
        System.out.println(two.price); //
        System.out.println(two.color); //
        System.out.println("=========");

        System.out.println(one.brand); //
        System.out.println(one.price); //
        System.out.println(one.color); //
        System.out.println("=========");


        two.call("欧巴"); //
        two.sendMessage(); //

        method(one); // 传递进去的参数其实就是地址值

        Phone three = getPhone();
        System.out.println(three.brand); //
        System.out.println(three.price); //
        System.out.println(three.color); //
    }
    public static void method(Phone param) {
        System.out.println(param.brand); //
        System.out.println(param.price); //
        System.out.println(param.color); //
    }
    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "荣耀";
        one.price = 9000.0;
        one.color = "玫瑰金";
        return one;
    }
}
