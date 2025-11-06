
import java.util.Scanner;

public class asg2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to swap : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //without third variable
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("without 3rd veriable, x= "+x+", y= "+y);
        //with third veriable
        int temp = x;
        x = y;
        y = temp;
        System.out.println("with 3rd veriable, x= "+x+", y= "+y);
        sc.close();
    }
}
/*
Enter two number to swap : 5 10
without 3rd veriable, x= 10, y= 5
with 3rd veriable, x= 5, y= 10
*/