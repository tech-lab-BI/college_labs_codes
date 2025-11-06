
import java.util.Scanner;

public class asg3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a>c)?(a>b)?a:b:(c>b)?c:b;
        System.out.println("Largest number : "+largest);
        sc.close();
    }
}
/*
Enter 3 number : 1 2 3
Largest number : 3

Enter 3 number : 1 3 2
Largest number : 3

Enter 3 number : 3 1 2
Largest number : 3
 */