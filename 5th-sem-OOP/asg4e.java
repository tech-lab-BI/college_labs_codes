
import java.util.Scanner;

public class asg4e {
    static boolean isMagic(int x){
        int n=0,r;
        while (x != 0) { 
            r = x%10;
            n += r;
            x/=10;
            if(x==0 && n/10==0){
                break;
            } else if(x==0 && n/10!=0){
                x = n;
                n=0;
            }
        }
        return (n==1)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(isMagic(n))
            System.out.println(n+" is Magic number.");
        else
            System.out.println(n+" is not Magic number.");
        sc.close();
    }
}
/*
Enter a number : 253
253 is Magic number.

Enter a number : 255
255 is not Magic number
 */