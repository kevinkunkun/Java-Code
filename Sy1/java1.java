package Sy1;
import java.util.Random;
import java.util.Scanner;
     public class java1 {
         public static void main(String[] args) {
             System.out.println("欢迎来到猜数字游戏！");
             Random random = new Random();
             int num = random.nextInt(100) + 1;
             Scanner scanner = new Scanner(System.in);
             System.out.println("#####游戏开始#####");
             System.out.println();
             int i,a;
             for ( i = 0; i < 10; i++) {
                 a=10-i;
                 System.out.print("请输入你猜测的数："+"\t\t");
                 System.out.println("剩余游戏次数："+a);
                 int toGuess = scanner.nextInt();
                 if (toGuess > num) {
                     System.out.println("猜大了");
                 } else if (toGuess < num) {
                     System.out.println("猜小了");
                 } else {
                     System.out.println("恭喜你，猜对了！");
                     System.out.println("挑战成功");break;
                 }
             }
             if(i>9)
             System.out.println("挑战失败");
         }
     }