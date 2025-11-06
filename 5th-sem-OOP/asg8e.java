
import java.util.Scanner;

abstract class shape{
    int a;
    int b;
    abstract void printArea();
}
class rectangle extends shape{
    void printArea(){
        System.out.println("Area of rectangle = "+(a*b));
    }
}
class triangle extends shape{
    void printArea(){
        System.out.println("Area of triangle = "+(0.5*(double)a*(double)b));
    }
}
class circle extends shape{
    void printArea(){
        System.out.println("Area of circle = "+(3.14*(double)a*(double)a));
    }
}
public class asg8e{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r = new rectangle();
        triangle t = new triangle();
        circle c = new circle();

        System.out.print("Enter hight & wide of rectangle : ");
        r.a = sc.nextInt();
        r.b = sc.nextInt();
        System.out.print("Enter hight & base of triangle : ");
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        System.out.print("Enter radius of circle : ");
        c.a = sc.nextInt();
        // r.b = sc.nextInt();

        r.printArea();
        t.printArea();
        c.printArea();
        sc.close();
    }
}
/*
Enter hight & wide of rectangle : 20 13
Enter hight & base of triangle : 23 17
Enter radius of circle : 9
Area of rectangle = 260
Area of triangle = 195.5
Area of circle = 254.34
 */