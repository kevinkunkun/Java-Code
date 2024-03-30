package Sy6;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPro {
    public static void main(String args[]){
        System.out.println("请输入一个正整数：");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(x+"的阶乘结果为："+getBigIntegerPro(x));
    }
    public static BigInteger getBigIntegerPro(int n){
        BigInteger result=new BigInteger("1");
        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
