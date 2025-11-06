
import java.util.Scanner;

public class asg4a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value : ");
        int x = sc.nextInt();
        System.out.print("Enter N value : ");
        int n = sc.nextInt();
        int y=1;
        for(int i=0;i<n;i++){
            y *= x;
        }
        System.out.println("Answer y= "+y);
        sc.close();
    }
}
/*
Enter x value : 3
Enter N value : 4
Answer y= 81
 */