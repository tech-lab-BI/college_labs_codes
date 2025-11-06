
import java.util.Scanner;

public class asg4c {
    static boolean isPrime(int n) {
        int r = (int)Math.sqrt((double)n);
        for(int i=2;i<=r;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=x;i<=y;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
        sc.close();
    }
}
/*
Enter range : 2 100 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */