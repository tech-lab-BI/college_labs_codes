
import java.util.Scanner;

public class asg6c {
    static void bubbleSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("Bubble sort : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
    static void selectionSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        System.out.print("Selection sort : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    static void insertionSort(int a[], int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int key = a[i];
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        System.out.print("Insertion sort : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter unsorted array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);
        System.out.println();
        selectionSort(arr, n);
        System.out.println();
        insertionSort(arr, n);
        sc.close();
    }
}
/*
Enter number of elements : 10 
Enter unsorted array : 1 2 -3 -6 2 8 7 0 4 -1
Bubble sort : -6 -3 -1 0 1 2 2 4 7 8 
Selection sort : -6 -3 -1 0 1 2 2 4 7 8
Insertion sort : -6 -3 -1 0 1 2 2 4 7 8
 */