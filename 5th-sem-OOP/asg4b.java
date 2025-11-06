
import java.util.Scanner;

public class asg4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms : ");
        int n = sc.nextInt();
        int pre=0,post=1,tem;
        System.out.print("Fibbonacci tersm = ");
        for(int i=0;i<n;i++){
            System.out.print(pre+" ");
            tem = pre;
            pre = post;
            post = tem+post;
        }
        sc.close();
    }
}
/*
Enter terms : 6
Fibbonacci tersm = 0 1 1 2 3 5 
 */