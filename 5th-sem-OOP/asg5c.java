
import java.util.Scanner;

public class asg5c {
    static int fact(int n){// recursion
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    static boolean isSpecial(int n){
        int x=n,s=0;
        while(x!=0){
            s+=fact(x%10);
            x/=10;
        }
        return (s==n)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isSpecial(n))
            System.out.println(n+" is special.");
        else    
            System.out.println(n+" is not special.");
        sc.close();
    }
}
/*
Enter a number : 145
145 is special.

Enter a number : 146
146 is not special.
 */