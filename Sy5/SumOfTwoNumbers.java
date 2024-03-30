package Sy5;

import java.util.InputMismatchException;
import java.util.Scanner;

class NumberRangeException extends Exception{
    public NumberRangeException(String message){

        super(message);
    }
}
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("请输入第一个要计算的数(提示：小于100的正整数)：");
        try {
            Scanner input1 = new Scanner(System.in);
            int s1 = input1.nextInt();
            System.out.println("请输入第二个要计算的的数(提示：小于100的正整数)：");
            Scanner input2 = new Scanner(System.in);
            int s2 = input2.nextInt();
            calculate(s1,s2);
        }catch (NumberRangeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("输入参数类型有误，请重新输入！");
        }catch (Exception e){
            System.out.println("其它异常！");
        }
    }
    public static void calculate(int s1,int s2) throws NumberRangeException {
        if(s1>100||s2>100){
            throw new NumberRangeException("输入的计算数据不在100以内，请检查数据！");
        }
        int sum;
        sum=s1+s2;
        System.out.println("两数之和为："+sum);
    }
}
