
import java.util.Scanner;

interface meanInterface{
    void mean(int arr[],int n);
}
// class A implements meanInterface{}
interface devInterface extends meanInterface{
    void deviation(int arr[],int n);
}
// class calculation implements devInterface{
//     int sum=0;
//     @Override
//     public void mean(int arr[],int n){
//         for(int i=0;i<n;i++){
//             sum += arr[i];
//         }
//         System.out.println("Mean = "+(sum/n));
//     }
//     @Override
//     public void deviation(int arr[],int n){
//         System.out.println("Deviation = ");
//         double m = sum/n;
//         for(int i=0;i<n;i++){
//             System.out.print((arr[i]-m)+", ");
//         }
//         System.out.println();
//     }
// }
public class asg8g implements devInterface{
    int sum=0;
    @Override
    public void mean(int arr[],int n){
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Mean = "+(sum/n));
    }
    @Override
    public void deviation(int arr[],int n){
        System.out.println("Deviation = ");
        double m = sum/n;
        for(int i=0;i<n;i++){
            System.out.print((arr[i]-m)+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        asg8g obj = new asg8g();
        obj.mean(a, n);
        obj.deviation(a, n);
        sc.close();
    }
}
/*
Enter number of elements : 5
Enter elements : 1 2 3 4 5
Mean = 3
Deviation =
-2.0, -1.0, 0.0, 1.0, 2.0,
 */