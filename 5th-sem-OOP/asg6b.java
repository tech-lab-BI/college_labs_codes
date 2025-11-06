
import java.util.Scanner;

public class asg6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first array element
        System.out.print("Enter number of element in first array : ");
        int m = sc.nextInt();
        int P[] = new int[m];
        System.out.print("Enter sorted first array element : ");
        for(int i=0;i<m;i++){
            P[i] = sc.nextInt();
        }

        //second array element
        System.out.print("Enter number of element in second array : ");
        int n = sc.nextInt();
        int Q[] = new int[n];
        System.out.print("Enter sorted second array element : ");
        for(int i=0;i<n;i++){
            Q[i] = sc.nextInt();
        }

        //thrid array preparation
        int i=0,j=0,k=0;
        int R[] = new int[m+n];
        while(i<m && j<n){
            if(P[i] < Q[j]){
                R[k++] = P[i++];
            } else if(P[i] > Q[j]){
                R[k++] = Q[j++];
            } else{
                R[k++] = P[i++];
                R[k++] = Q[j++];
            }
        }
        while(i<m){
            R[k++] = P[i++];
        }
        while(j<n){
            R[k++] = Q[j++];
        }
        System.out.print("New array element : ");
        for(i=0;i<m+n;i++){
            System.out.print(R[i]+", ");
        }

        sc.close();
    }
}
/*
Enter number of element in first array : 6
Enter sorted first array element : 4 5 6 7 8 9   
Enter number of element in second array : 4 
Enter sorted second array element : 1 2 10 11
New array element : 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 
 */