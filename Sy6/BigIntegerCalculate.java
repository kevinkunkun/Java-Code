package Sy6;

import java.math.BigInteger;

public class BigIntegerCalculate {
    public static void main(String[] args) {
        System.out.println("1至999999999的和为："+Calculate(999999999));
    }
    public static BigInteger Calculate(int n){
        BigInteger result=new BigInteger("1");
        for(int i=2;i<=n;i++){
            result=result.add(BigInteger.valueOf(i));
        }
        return result;
    }
}
