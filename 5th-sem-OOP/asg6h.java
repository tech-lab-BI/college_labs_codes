
import java.util.Scanner;

public class asg6h {
    static int a[][];
    static int m;
    static void dispaly(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[] insertionSort(int t[],int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int key = t[i];
            while(j >= 0 && t[j] > key){
                t[j+1] = t[j];
                j--;
            }
            t[j+1] = key;
        }
        return t;
    }
    static void sort(){// only non-boundary elements
        int dSize = (m-2)*(m-2);//diagonal array size
        int arr[] = new int[dSize];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && j!=0 && i!=m-1 && j!=m-1){
                    arr[k++]=a[i][j];
                }
            }
        }
        arr = insertionSort(arr, dSize);
        k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i!=0 && j!=0 && i!=m-1 && j!=m-1){
                    a[i][j]=arr[k++];
                }
            }
        }
    }
    static void diagonalDispaly(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j || (i+j==m-1)){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of square matrix(3-10) : ");
        m = sc.nextInt();
        a = new int[m][m];
        System.out.println("Enter matrix elemnets : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("--------------------------------------");
        dispaly();
        System.out.println("--------------------------------------");
        sort();
        dispaly();
        System.out.print("\n--------------------------------------\n");
        diagonalDispaly();
        sc.close();
    }
}
/*
Enter row of square matrix(3-10) : 4
Enter matrix elemnets : 
9 2 1 5
8 13 8 4
15 6 3 11
7 12 23 8
--------------------------------------
9 2 1 5
8 13 8 4
15 6 3 11
7 12 23 8
--------------------------------------
9 2 1 5
8 3 6 4
15 8 13 11
7 12 23 8

--------------------------------------
9     5
  3 6
  8 13
7     8
 */