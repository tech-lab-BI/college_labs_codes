
import java.util.Scanner;

class squreDesign{
    void rect(int n, char c){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    void rect(int x,int y,char c){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
public class asg7e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squreDesign s = new squreDesign();
        int h,w;
        char c;

        System.out.print("Enter hight : ");
        h = sc.nextInt();
        System.out.print("Enter charecter : ");
        c = sc.next().charAt(0);
        s.rect(h, c);

        System.out.print("Enter hight & weidth: ");
        h = sc.nextInt();
        w = sc.nextInt();
        System.out.print("Enter charecter : ");
        c = sc.next().charAt(0);
        s.rect(h, w, c);

        sc.close();
    }
}
/*
Enter hight : 5
Enter charecter : A
A A A A A 
A A A A A 
A A A A A 
A A A A A 
A A A A A 
Enter hight & weidth: 4 6
Enter charecter : B 
B B B B B B 
B B B B B B 
B B B B B B 
B B B B B B 
 */