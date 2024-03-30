package Sy4;

interface EqualDiagonal{
    public abstract double getDiagonal();
}
class Rectangle1 implements EqualDiagonal{
    double length,width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(length*length+width*width);
    }
}

class Square implements EqualDiagonal{
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2*length*length);
    }
}

public class CalculatedHypotenuse {
    public static void main(String[] args) {
        Rectangle1[] rectangles=new Rectangle1[]{
                new Rectangle1(1, 2),
                new Rectangle1(5, 4),
                new Rectangle1(6, 2)
        };
        System.out.println("矩形斜边长度：");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].getDiagonal()+" ");
        }
        Square[] squares=new Square[]{
                new Square(5),
                new Square(2),
                new Square(8)
        };
        System.out.println("正方形斜边长度：");
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i].getDiagonal()+" ");
        }
    }
}