package Sy3;
import java.util.ArrayList;

public class QunZhu2 {
        public static void main(String[] args) {
            QunZhu3 tom = new QunZhu3("tom", 29.9);
            QunZhu1 join = new QunZhu1("join", 100);
            ArrayList<Integer> list = join.send(100, 5);
            System.out.println("发出的红包金额分别为：" + list);
            tom.receive(list);
        }
    }
