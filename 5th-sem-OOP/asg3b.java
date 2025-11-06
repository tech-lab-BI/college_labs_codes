
import java.util.Scanner;

public class asg3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quadratic roots : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a != 0){
            float d = (b*b)-(4*a*c);
            if(d > 0){
                float r1=((-b)+(float)Math.sqrt((double)d))/(2*a);
                float r2=((-b)-(float)Math.sqrt((double)d))/(2*a);
                System.out.println("Roots are real, R1= "+r1+", R2= "+r2);
            } else if(d < 0){
                float r=(-b)/(2*a);
                float i=(float)(Math.sqrt(-(double)d))/(2*a);//make d +ve
                System.out.print("Roots are imaginary, ");
                System.out.printf("R1 = %f+%.2fi, ",r,i);
                System.out.printf("R1 = %f-%.2fi",r,i);
            } else{
                float r=((-b)+(float)Math.sqrt((double)d))/(2*a);
                System.out.println("Roots are equal & real, R1=R2= "+r);
            }
        } else{
            System.out.println("It's not quadratic equation.");
        }
        sc.close();
    }
}
/*
Enter quadratic roots : 1 2 3
Roots are imaginary, R1 = -1.000000+1.41i, R1 = -1.000000-1.41i

Enter quadratic roots : 1 3 2
Roots are real, R1= -1.0, R2= -2.0

Enter quadratic roots : 2 4 2
Roots are equal & real, R1=R2= -1.0
 */