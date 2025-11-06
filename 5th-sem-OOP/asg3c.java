
import java.util.Scanner;

public class asg3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int y = sc.nextInt();
        // boolean test =  (y%100==0)?((y%400==0)?true:false):((y%4==0)?true:false);// redundent, its not error 
        // because true, false block contains itself true , false statement.
        int test =  (y%100==0)?((y%400==0)?1:0):((y%4==0)?1:0);
        if(test==1){
            System.out.println(y+" is a leap year.");
        } else{
            System.out.println(y+ " is not a leap year.");
        }
        sc.close();
    }
}
