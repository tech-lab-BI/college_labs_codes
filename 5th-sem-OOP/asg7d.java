
import java.util.Scanner;

class name{
    String f;
    String m;
    String l;
    name(String f,String m,String l){
        this.f = f;
        this.m = m;
        this.l = l;
    }
}
class DOB{
    int dd;
    int mm;
    int yy;
    DOB(int dd,int mm,int yy){
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
}
class student{
    int id;
    name n;
    void nameSet(String f,String m,String l){
        n = new name(f,m,l);
    }
    String gender;
    DOB d;
    void dobSet(int dd,int mm,int yy){
        d = new DOB(dd,mm,yy);
    }
    int marks[] = new int[3];//eng, math, cs
    void display(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+n.f+" "+n.m+" "+n.l);
        System.out.println("gender : "+gender);
        System.out.println("Date of Birth : "+d.dd+" "+d.mm+" "+d.yy);
        System.out.printf("Marks : %d, %d, %d \n",marks[0],marks[1],marks[2]);
        System.out.println("-------------------");
    }
}
public class asg7d {
    static void search(student s[],int n,Scanner sc){
        System.out.println("1. search by ID\n2. search by Name\n3.exit");
        while (true) { 
            System.out.print("chioce :: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1 -> {
                    System.out.print("Enter id : ");
                    int id = sc.nextInt();
                    int i;
                    for(i=0;i<n;i++){
                        if(s[i].id == id){
                            s[i].display();
                            break;
                        }
                    }
                    if(i >= n){
                        System.out.println("id not found!!");
                    }
                }
                case 2 -> {
                    System.out.print("Enter first name : ");
                    String fs = sc.next();
                    int i;
                    for(i=0;i<n;i++){
                        if(s[i].n.f.equalsIgnoreCase(fs)){
                            s[i].display();
                            break;
                        }
                    }
                    if(i >= n){
                        System.out.println("id not found!!");
                    }
                }
                case 3 -> {
                    System.exit(0);
                }
                default ->
                    System.out.println("Invaild chioce!!");

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of student : ");
        int n = sc.nextInt();
        student s[] = new student[n];
        System.out.println("Enter students details : ");
        for(int i=0;i<n;i++){
            s[i] = new student();
            System.out.println((i+1)+" student ->");
            System.out.print("ID : ");
            s[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name : ");
            s[i].nameSet(sc.next(), sc.next(), sc.next());
            sc.nextLine();
            System.out.print("gender : ");
            s[i].gender = sc.next();
            sc.nextLine();
            System.out.print("Date of Birth : ");
            s[i].dobSet(sc.nextInt(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            System.out.print("Marks : ");
            s[i].marks[0] = sc.nextInt();//eng
            s[i].marks[1] = sc.nextInt();//math
            s[i].marks[2] = sc.nextInt();//cs
            sc.nextLine();
        }

        System.out.println("---------- Database ----------");
        for(int i=0;i<n;i++){
            s[i].display();
        }

        search(s, n, sc);
        // System.out.println("1. search by ID\n2. search by Name\nchoose : ");
        // int ch = sc.nextInt();
        // switch
        sc.close();
    }
}
/*
Enter numbers of student : 2
Enter students details : 
1 student ->
ID : 001
Name : bik r sam
gender : male
Date of Birth : 01 02 03
Marks : 30 20 10
2 student ->
ID : 002
Name : sam r bik
gender : male
Date of Birth : 14 25 36
Marks : 96 85 74
---------- Database ----------
ID : 1
Name : bik r sam
gender : male
Date of Birth : 1 2 3
Marks : 30, 20, 10 
-------------------
ID : 2
Name : sam r bik
gender : male
Date of Birth : 14 25 36
Marks : 96, 85, 74 
-------------------
1. search by ID
2. search by Name
3.exit
chioce :: 1
Enter id : 2
ID : 2
Name : sam r bik
gender : male
Date of Birth : 14 25 36
Marks : 96, 85, 74
-------------------
chioce :: 1
Enter id : 3
id not found!!
chioce :: 2
Enter first name : sam
ID : 2
Name : sam r bik
gender : male
Date of Birth : 14 25 36
Marks : 96, 85, 74
-------------------
chioce :: 2
Enter first name : er
id not found!!
chioce :: 3
 */