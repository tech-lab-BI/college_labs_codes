
import java.util.Scanner;

class mathException extends Exception{
    public mathException(String  s) {
        System.out.println("math exception - "+s);
    }
}
class overflowException extends mathException{

    public overflowException(String s) {
        // System.out.println("overflow");
        super(s);
    }
    
}
class underflowException extends mathException{

    public underflowException(String s) {
        // System.out.println("underflow");
        super(s);
    }
}
public class asg9d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        try {
            if(n>100){
                throw new overflowException("high");
            } else{
                throw new underflowException("low");
            }
        } catch (underflowException e){
            System.out.println(e);
        } catch (overflowException e){
            System.out.println(e);
        } catch (mathException e) {
            System.out.println(e);
        }
    }
}
/*
Enter number : 101
math exception - high
overflowException

Enter number : 99
math exception - low
underflowException
 */