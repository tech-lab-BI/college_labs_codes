
import java.util.Scanner;

public class asg2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic pay : ");
        double bp = sc.nextDouble();
        double agp = bp*0.5;
        double merged_basic = (bp+agp);
        double da = merged_basic*0.5;
        double hra = merged_basic*0.15;
        System.out.printf("Total salary = %.3f",(bp+agp+da+hra));
        sc.close();
    }
}
/*
Enter Basic pay : 10000
Total salary = 24750.000
 */