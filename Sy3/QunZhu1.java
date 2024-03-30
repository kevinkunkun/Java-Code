package Sy3;
import java.util.ArrayList;
import java.util.Random;

    public class QunZhu1 extends QunZhu{
        public QunZhu1(String name, double balance) {
            super(name, balance);
        }
        public  ArrayList<Integer> send(int totalMoney, int count) {
            ArrayList<Integer> list = new ArrayList<>();
            if (totalMoney <= 0 || count <= 0) {
                return list;
            }
            int money;
            do {
                money = new Random().nextInt(totalMoney)+1;
            } while (money*(count-1)>=totalMoney);
            for (int i = 0; i < count-1; i++) {
                list.add(money);
                totalMoney -= money;
            }
            list.add(totalMoney);
            return list;
        }
    }
