/* 
    Abstraction
    Create an abstract class Shape with an abstract method area() and implement it in Circle and Rectangle.
*/

abstract class Shape 
{
    
    abstract double Area();
}


class Circle extends Shape 
{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape 
{
    double length, width;

    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double Area() 
    {
        return length * width;
    }
}


public class Q14 
{
    public static void main(String[] args) 
    {
        Shape circle = new Circle(6.5);
        System.out.println("Area of Circle is:" + circle.Area());

        Shape rectangle = new Rectangle(8.9, 6.6);
        System.out.println("Area of Rectangle is:" + rectangle.Area());
    }
}
