
import java.util.Scanner;

public class asg4d {
    static boolean isPalindrome(int x){
        int n=x,r,reverse=0;
        while(n!=0){
            r = n%10;
            n = n/10;
            reverse = (reverse*10) + r;
        }
        return (reverse==x)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(isPalindrome(n))
            System.out.println(n+" is a palindrome number.");
        else
            System.out.println(n+" is not a palindrome.");
        sc.close();
    }
}
/*
Enter number : 121
121 is a palindrome number.

Enter number : 123
123 is not a palindrome.
 */