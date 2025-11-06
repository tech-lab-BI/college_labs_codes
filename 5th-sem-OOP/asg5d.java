
import java.util.Scanner;

public class asg5d {
    static boolean isPrime(int x){
        int r = (int)Math.sqrt((double)x);
        for(int i=2;i<=r;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    static boolean isMagic(int x){
        int n=0;
        while(x!=0){
            n+=x%10;
            x/=10;
            if(x==0 && n/10==0){
                if(n==1) return true;
                else break;
            } else if (x==0 && n/10!=0) {
                x=n;
                n=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("composite magic numbers between "+m+" to "+n+" are : ");
        for(int i=m;i<=n;i++){
            if(!isPrime(i) && isMagic(i)){
                System.out.print(i+", ");
            }
        }
        sc.close();
    }
}
/*
Enter range : 10 100
composite magic numbers between 10 to 100 are : 10, 28, 46, 55, 64, 82, 91, 100, 
 */