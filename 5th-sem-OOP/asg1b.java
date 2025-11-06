
import java.util.Scanner;

public class asg1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter redius of circle : ");
        double r = sc.nextDouble();
        System.out.println("Area = "+(3.14*r*r));
        System.out.println("PErimeter = "+(2*3.14*r));
        sc.close();
    }
}
/*
Enter redius of circle : 3
Area = 28.259999999999998
PErimeter = 18.84
 */