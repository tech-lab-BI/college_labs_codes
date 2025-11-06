
import java.util.Scanner;

public class asg6e {
    static int max = 3;
    static int stack[]=new int[max];
    static int top=-1;
    static boolean isFull(){
        if(top+1 == max)
            return true;
        return false;
    }
    static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    static void push(int val){
        if(!isFull())
            stack[++top] = val;
        else
            System.out.println("Stack full");
    }
    static int pop(){
        if(!isEmpty())
            return stack[top--];
        return -999;
    }
    static void display(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println("(top)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack\n1. push\n2. pop\n3. display\n4. exit");
        while (true) { 
            System.out.print("Choose operation : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter value : ");
                    int v = sc.nextInt();
                    push(v);
                    break;
                case 2:
                    int x = pop();
                    if(x == -999){
                        System.out.println("Stack already empty.");
                    } else{
                        System.out.println(x+" removed from stack.");
                    }
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("wrong chioce.");
            }
        }
    }
}
/*
1. push
2. pop
3. display
4. exit
Choose operation : 3
Stack empty
Choose operation : 2
Stack already empty.
Choose operation : 1
Enter value : 12
Choose operation : 3
12 (top)
Choose operation : 1
Enter value : 54
Choose operation : 1
Enter value : 66
Choose operation : 3
12 54 66 (top)
Choose operation : 2
66 removed from stack.
Choose operation : 2
54 removed from stack.
Choose operation : 2
12 removed from stack.
Choose operation : 2
Stack already empty.
Choose operation : 4
 */