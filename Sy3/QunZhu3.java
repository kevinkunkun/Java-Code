package Sy3;
import java.util.ArrayList;
import java.util.Collections;

    public class QunZhu3  extends QunZhu{
        public QunZhu3(String name, double balance) {
            super(name, balance);
        }
        public  void receive(ArrayList<Integer> list) {
            if (list == null || list.size() == 0) {
                System.out.println("红包为空！");
                return;
            }
            Collections.sort(list); // 对红包金额排序
            int sum = 0;
            for (int money : list) {
                sum += money;
            }
        }
}
