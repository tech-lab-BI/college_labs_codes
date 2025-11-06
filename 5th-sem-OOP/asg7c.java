
import java.util.Scanner;
class Fibbonacci{
    void fib(int n,int pre, int post){
        if(n<1){
            return;
        }
        System.out.print(pre+", ");
        fib(n-1, post, (pre+post));
    }
}
public class asg7c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();
        Fibbonacci f = new Fibbonacci();
        f.fib(n, 0, 1);
        sc.close();
    }
}
/*
Enter number of terms : 10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
 */