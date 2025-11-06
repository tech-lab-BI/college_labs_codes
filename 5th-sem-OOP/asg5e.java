
import java.util.Scanner;

public class asg5e {
    static boolean isPrime(int x){
        int r = (int)Math.sqrt((double)x);
        for(int i=2;i<=r;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count=0,x=n;
        while(x%10!=0){
            count++;
            x/=10;
        }
        x = n;
        int m=10;
        for(int i=1;i<count-1;i++){
            m *= 10;
        }
        System.out.print(n);
        for(int i=0;i<count;i++){
            if(isPrime(x)){
                x = ((x%m)*10 + (x/m));
                if(x == n){
                    System.out.println();
                    System.out.print(n+" is circular Prime.");
                } else{
                    System.out.print(" - "+x);
                }
            } else{
                System.out.println();
                System.out.print(n+" is not circular Prime.");
                break;
            }
        }
        sc.close();
    }
}
/*
Enter a number : 197
197 - 971 - 719
197 is circular Prime.

Enter a number : 29
29 - 92
29 is not circular Prime.
 */