import java.util.Scanner;

abstract class Figure{
    float x,y;
    @SuppressWarnings("unused")//avoid warning
    abstract float calculateArea();
}
class Rectangle extends Figure{
    Rectangle(float x,float y){
        super.x = x;
        super.y = y;
    }
    @Override
    float calculateArea(){
        return (x*y);
    }
}
class Triangle extends Figure{
   Triangle(float x,float y){
        super.x = x;
        super.y = y;
    }
    @Override
    float calculateArea(){
        return ((float)0.5*x*y);
    }
}
public class asg8c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x,y : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        Rectangle s1 = new Rectangle(x,y);
        Triangle s2 = new Triangle(x,y);

        System.out.println("Area of Rectangle : "+s1.calculateArea());
        System.out.println("Area of Triangle : "+s2.calculateArea());
        sc.close();
    }
}
/*
Enter x,y : 4 5
Area of Rectangle : 20.0
Area of Triangle : 10.0
 */