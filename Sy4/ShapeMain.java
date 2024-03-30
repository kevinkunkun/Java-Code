package Sy4;

import java.util.ArrayList;
import java.util.Arrays;
abstract class shape{
    public abstract double outputArea();
    public abstract double outputLength();
}
 class Rectangle extends shape implements Comparable<Rectangle>{
    double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double outputArea() {
        return length*width;
    }

    @Override
    public double outputLength() {
        return 2*(length+width);
    }

    @Override
    public int compareTo(Rectangle o) {
        if(this.outputArea()>o.outputArea()) return 1;
        else if(this.outputArea()<o.outputArea()) return -1;
        else return 0;
    }
}
 class Circle extends shape implements Comparable<Rectangle>{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double outputArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double outputLength() {
        return 2*Math.PI*radius;
    }

    @Override
    public int compareTo(Rectangle o) {
        if(this.outputArea()>o.outputArea()) return 1;
        else if(this.outputArea()<o.outputArea()) return -1;
        else return 0;
    }
}

public class ShapeMain{
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(1, 2),
                new Rectangle(2, 3),
                new Rectangle(0.5, 0.6)
        };
        System.out.println("矩形数组的面积：");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].outputArea() + "　");
        }

        Arrays.sort(rectangles);
        System.out.println("排序后矩形数组的面积：");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].outputArea() + "　");
        }
        Circle[] circles = new Circle[]{
                new Circle(1),
                new Circle(2),
                new Circle(0.5)
        };
        System.out.println("圆形数组的面积：");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].outputArea() + "　");
        }

        Arrays.sort(rectangles);
        System.out.println("排序后圆形数组的面积：");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].outputArea() + "　");
        }
    }
}

