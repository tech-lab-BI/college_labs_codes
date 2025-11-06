
import java.util.Scanner;

abstract class number{//if i use any abstract method i need to abstract the class
    int value;
    @SuppressWarnings("unused")//avoid warning
    abstract void displayNum(int n);
}
class hexNum extends number{
    @Override
    void displayNum(int n){
        super.value = n;
        System.out.println("HexNum : "+Integer.toHexString(value));
    }
}
class octNum extends number{
    @Override
    void displayNum(int n){
        super.value = n;
        System.out.println("HexNum : "+Integer.toOctalString(value));
    }
}
public class asg8b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        hexNum num1 = new hexNum();
        octNum num2 = new octNum();

        num1.displayNum(n);
        num2.displayNum(n);
    }
}
/*
Enter a number : 15
HexNum : f
HexNum : 17
 */