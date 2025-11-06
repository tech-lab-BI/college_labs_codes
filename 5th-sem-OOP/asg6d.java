
import java.util.Scanner;

public class asg6d {
    static int linearSearch(int a[],int n, int x){
        for(int i=0;i<n;i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int a[], int n, int x){
        int l=0,h=n-1;
        while(l <= h){
            int mid = (l+h)/2;
            if(a[mid] == x){
                return mid;
            } else if(a[mid] < x){
                l = mid+1;
            } else{
                h = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter sorted array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter search element : ");
        int target = sc.nextInt();

        int pos = linearSearch(arr, n, target);
        System.out.print("applying Linear search :: ");
        if(pos == -1){
            System.out.println("Elemrnt not found!!");
        } else{
            System.out.println(target+" found at position "+(pos+1));
        }

        pos = binarySearch(arr, n, target);
        System.out.print("applying Binary search :: ");
        if(pos == -1){
            System.out.println("Elemrnt not found!!");
        } else{
            System.out.println(target+" found at position "+(pos+1));
        }
    }
}
/*
Enter number of elements : 10
Enter sorted array : 1 2 3 4 5 6 7 8 9 10
Enter search element : 4
applying Linear search :: 4 found at position 4
applying Binary search :: 4 found at position 4

Enter number of elements : 10
Enter sorted array : 1 2 3 4 4 5 6 7 8 9
Enter search element : 4
applying Linear search :: 4 found at position 4
applying Binary search :: 4 found at position 5

Enter number of elements : 10
Enter sorted array : 1 2 3 4 5 6 7 8 9 10
Enter search element : 15
applying Linear search :: Elemrnt not found!!
applying Binary search :: Elemrnt not found!!

Enter number of elements : 6
Enter sorted array : 6 5 4 3 2 1
Enter search element : 2
applying Linear search :: 2 found at position 5
applying Binary search :: Elemrnt not found!!
 */