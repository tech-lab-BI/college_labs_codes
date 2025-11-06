import java.util.Scanner;
class TowerOfHanoi{
    int count=0;
    void TOH(int n, char s, char a, char d){
        count++;
        if(n == 1){
            System.out.println("Move disk "+n+" from "+s+" to "+d+" using "+a);
            System.out.println("Total movement : "+count);
            return;
        }
        TOH(n-1, s, d, a);
        System.out.println("Move disk "+n+" from "+s+" to "+d+" using "+a);
        TOH(n-1, a, s, d);
    }
}
public class asg7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk : ");
        int n = sc.nextInt();
        TowerOfHanoi T = new TowerOfHanoi();
        T.TOH(n, 'A', 'B', 'C');
        sc.close();
    }    
}
/*
Enter number of disk : 5
Move disk 1 from A to C using B
Move disk 2 from A to B using C
Move disk 1 from C to B using A
Move disk 3 from A to C using B
Move disk 1 from B to A using C
Move disk 2 from B to C using A
Move disk 1 from A to C using B
Move disk 4 from A to B using C
Move disk 1 from C to B using A
Move disk 2 from C to A using B
Move disk 1 from B to A using C
Move disk 3 from C to B using A
Move disk 1 from A to C using B
Move disk 2 from A to B using C
Move disk 1 from C to B using A
Move disk 5 from A to C using B
Move disk 1 from B to A using C
Move disk 2 from B to C using A
Move disk 1 from A to C using B
Move disk 3 from B to A using C
Move disk 1 from C to B using A
Move disk 2 from C to A using B
Move disk 1 from B to A using C
Move disk 4 from B to C using A
Move disk 1 from A to C using B
Move disk 2 from A to B using C
Move disk 1 from C to B using A
Move disk 3 from A to C using B
Move disk 1 from B to A using C
Move disk 2 from B to C using A
Move disk 1 from A to C using B
Total movement : 31
 */