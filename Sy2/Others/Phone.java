package Sy2.Others;

public class Phone {
        // 成员变量
        String brand; // 品牌
        double price; // 价格
        String color; // 颜色

        // 成员方法：打电话给who
        public void call(String who) {
            System.out.println("给" + who + "打电话");
        }
        // 成员方法：群发短信
        public void sendMessage() {
            System.out.println("群发短信");
        }
    }
