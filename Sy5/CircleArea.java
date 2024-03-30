package Sy5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        System.out.println("请输入半径：");
        try {
            Scanner input = new Scanner(System.in);
            double radius = input.nextDouble();
            Circle(radius);
        }catch (InputMismatchException e){
            System.out.println("输入参数类型有误，请重新输入！");
        }
    }
    public static void Circle(double radius){
        double square;
        square=Math.PI*radius*radius;
        System.out.println("所求圆形面积为："+square);
    }
}