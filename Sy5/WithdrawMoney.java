package Sy5;

import java.util.InputMismatchException;
import java.util.Scanner;

class Card{
    private String name;
    private double balance;
    public Card(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "卡名：'" + name + '\'' +
                ", 当前余额=" + balance +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class InsufficientFundsException extends Exception{
    public  InsufficientFundsException(){};
    public InsufficientFundsException(String message){

        super(message);
    }
}
class Bank {
    public static double withdrawal(Card card,double money) throws InsufficientFundsException {
        if (money > card.getBalance()) {
            throw new InsufficientFundsException("所取金额超出账户余额！");
        }
        card.setBalance(card.getBalance()-money);
        return money;
    }

    public  static double deposit(double money){
        double balance=money;
        return balance;
    }

    public  static String name(String cardname){
        String name=cardname;
        return name;
    }
}
public class WithdrawMoney {
    public static void main(String[] args) {
        try {
        System.out.println("请输入您银行卡的名称：");
        Scanner input1=new Scanner(System.in);
        String name=input1.nextLine();
        System.out.println("请输入您开卡所存入的金额：");
        Scanner input2=new Scanner(System.in);
        double n=input2.nextDouble();
        Card card=new Card(name,n);
        Bank bank=new Bank();
        double balance=bank.deposit(n);
        System.out.println("存钱成功！");
        System.out.println("银行卡信息："+card.toString());
        System.out.println("请输入您要取款的金额：");
        Scanner input3=new Scanner(System.in);
        double x=input3.nextDouble();
            double money=bank.withdrawal(card,x);
            System.out.println("取款成功！");
            System.out.println("取款金额："+money);
            System.out.println("取款后余额："+card.getBalance());
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("请重新输入！");
        }catch (InputMismatchException e){
            System.out.println("输入数据类型错误！请重新输入！");
        }catch (Exception e){
            System.out.println("其他异常！");
        }
    }
}
