
import java.util.Scanner;

abstract class geometricObject{
    String color;
    double weight;
    geometricObject() {
        color = "Whight";
        weight = 1.0;
    }
    String getColor(){
        return color;
    }
    double getWeight(){
        return weight;
    }
    // @SuppressWarnings("unused")//avoid warning
    abstract double findArea();
    // @SuppressWarnings("unused")
    abstract double findCircumference();
}
class Triangle extends geometricObject{
    double hight;
    double base;

    public Triangle(double x,double y) {
        hight = x;
        base = y;
    }
    @Override
    double findArea(){
        return (0.5*hight*base);
    }
    @Override
    double findCircumference(){
        return (3*base);
    }
}
public class asg8d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hight & base : ");
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        Triangle t = new Triangle(h, b);
        System.out.println("Color : "+t.getColor());
        System.out.println("Weight : "+t.getWeight());
        System.out.println("Area : "+t.findArea());
        System.out.println("Circumference : "+t.findCircumference());
        sc.close();
    }
}
/*
Enter hight & base : 5 6
Color : Whight
Weight : 1.0
Area : 15.0
Circumference : 18.0
 */