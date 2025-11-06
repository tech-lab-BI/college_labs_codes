
import java.util.Scanner;

public class asg5a {
    static void starPattern(int n){
        for (int i=0;i<n;i++) {
            // for(int j=0;j<=n-i;j++){//for space
            //     System.out.print("  ");
            // }
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void alphaPattern(int n){
        char c = 'A';
        for (int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++){//for space
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    static void numberPattern(int n){
        for (int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++){//for space
                System.out.print("  ");
            }
            int x=1;
            for(int j=0;j<=i;j++){//for number
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int n = sc.nextInt();
        starPattern(n);
        alphaPattern(n);
        numberPattern(n);
        sc.close();
    }
}
/*
Enter number of row : 5
* 
* *
* * *
* * * *
* * * * *
     A
    B C
   D E F
  G H I J
 K L M N O
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5

Enter number of row : 6
* 
* *
* * *
* * * *
* * * * *
* * * * * *
      A
     B C
    D E F
   G H I J
  K L M N O
 P Q R S T U
          1
        1 2
      1 2 3
    1 2 3 4
  1 2 3 4 5
1 2 3 4 5 6
 */