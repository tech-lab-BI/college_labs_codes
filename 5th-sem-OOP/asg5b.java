
import java.util.Scanner;

public class asg5b {
    static boolean isAutomorphic(int n){
        int square = (n*n);
        int count=0,x=n;
        while(x!=0){
            count++;
            x/=10;
        }
        return (square%(count*10)==n)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isAutomorphic(n))
            System.out.println(n+" is automorphic.");
        else    
            System.out.println(n+" is not automorphic.");
        sc.close();
    }
}
/*
Enter a number : 25
25 is not automorphic.

Enter a number : 26
26 is not automorphic.
 */