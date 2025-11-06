
import java.util.Scanner;

class Employee{
    int EID;
    String name;
    double basicPay;
    String city;
    double agpRate, daRate, hraRate, salary;
    void setDetails(int EID,String name,double basicPay,String city){
        this.EID = EID;
        this.name = name;
        this.basicPay = basicPay;
        this.city = city;
    }
    void showDetails(){
        System.out.println("--------------------------");
        System.out.println("EID : "+EID);
        System.out.println("Name : "+name);
        System.out.println("Basic Salary : "+basicPay);
        System.out.println("City : "+city);
        System.out.printf("Total Salary : %.4f",salary);
        System.out.println("--------------------------");
    }
    void grossSalary(){
        // agp = basicPay*agp;//lead to confusion logically
        double agp = basicPay*agpRate;
        double merge = basicPay + agp;
        double da = merge*daRate;
        double hra = merge*hraRate;
        salary = merge+da+hra;
    }
}
class companyA extends Employee{
    public companyA(){// super keyword cannot write outside of method
        super.agpRate = 0.4;
        super.daRate = 0.25;
        super.hraRate = 0.1;
    }
}
class companyB extends Employee{
    public companyB() {
        super.agpRate = 0.5;
        super.daRate = 0.5;
        super.hraRate = 0.15;
    }
}
public class asg8a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        companyA emp1 = new companyA();
        companyB emp2 = new companyB();
        int EID;
        String name;
        double basicPay;
        String city;

        System.out.print("Enter EID : ");
        EID = sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Basic Pay : ");
        basicPay = sc.nextDouble();
        System.out.print("City : ");
        city = sc.next();
        sc.nextLine();
        emp1.setDetails(EID, name, basicPay, city);
        emp1.grossSalary();

        System.out.print("Enter EID : ");
        EID = sc.nextInt();
        sc.nextLine();
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Basic Pay : ");
        basicPay = sc.nextDouble();
        System.out.print("City : ");
        city = sc.next();
        sc.nextLine();
        emp2.setDetails(EID, name, basicPay, city);
        emp2.grossSalary();

        emp1.showDetails();
        emp2.showDetails();

        sc.close();
    }
}
/*
Enter EID : 1001
Name : bik ram
Basic Pay : 5000.78
City : chan
Enter EID : 1002
Name : sam ram
Basic Pay : 5000.78
City : chu
--------------------------
EID : 1001
Name : bik ram
Basic Salary : 5000.78
City : chan
Total Salary : 9451.4742
--------------------------
--------------------------
EID : 1002
Name : sam ram
Basic Salary : 5000.78
City : chu
Total Salary : 12376.9305
--------------------------
 */