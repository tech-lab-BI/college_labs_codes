
import java.util.Scanner;

public class asg6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1D array input
        System.out.print("Enter number of element in 1D array : ");
        int n = sc.nextInt();
        int arr1D[] = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr1D[i] = sc.nextInt();
        }

        //2D array input
        System.out.print("Enter number of row & colom in 2D array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr2D[][] = new int[r][c];
        System.out.println("Enter elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        int large,small;
        //find largest and samllest in 1D array
        large = arr1D[0];
        small = arr1D[0];
        for(int i=1;i<n;i++){
            if(large<arr1D[i])
                large = arr1D[i];
            if(small>arr1D[i])
                small = arr1D[i];
        }
        System.out.println("From the 1D array : ");
        System.out.println("Largest = "+large+" samllest = "+small);

        //find largest and samllest in 2D array
        large = arr2D[0][0];
        small = arr2D[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(large<arr2D[i][j])
                    large = arr2D[i][j];
                if(small>arr2D[i][j])
                    small = arr2D[i][j];
            }
        }
        System.out.println("From the 2D array : ");
        System.out.println("Largest = "+large+" samllest = "+small);
        
        sc.close();
    }
}
/*
Enter number of element in 1D array : 4
Enter elements : 
2 9 -10 3
Enter number of row & colom in 2D array : 3 3
Enter elements : 
-1 -2 -3 
 2  3  1
 4 -5  6
From the 1D array : 
Largest = 9 samllest = -10
From the 2D array :
Largest = 6 samllest = -5
 */