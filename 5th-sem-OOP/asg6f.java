
import java.util.Scanner;

public class asg6f {
    static int max = 3;
    static int queue[]=new int[max];// linear queue capacity 10
    static int f=-1;
    static int r=-1;
    static boolean isFull(){
        if(r+1 == max)
            return true;
        return false;
    }
    static boolean isEmpty(){
        if(f==-1){
            return true;
        }
        return false;
    }
    static void enq(int val){
        if(isEmpty()){
            f=0;
            queue[++r] = val;
        } else if(!isFull()){
            queue[++r] = val;
        } else{
            System.out.println("Queue full");
        }
    }
    static int deq(){
        if(f==r && f!=-1){
            int x = queue[f];
            f=r=-1;
            return x;
        }else if(!isEmpty())
            return queue[f++];
        return -999;
    }
    static void display(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return;
        }
        for(int i=f;i<=r;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Queue\n1. enqueue\n2. dequeue\n3. display\n4. exit");
        while (true) { 
            System.out.print("Choose operation : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter value : ");
                    int v = sc.nextInt();
                    enq(v);
                    break;
                case 2:
                    int x = deq();
                    if(x == -999){
                        System.out.println("Queue already empty.");
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
Linear Queue
1. enqueue
2. dequeue
3. display
4. exit
Choose operation : 3
Queue empty
Choose operation : 2
Queue already empty.
Choose operation : 1
Enter value : 22
Choose operation : 3
22 
Choose operation : 2
22 removed from stack.
Choose operation : 2
Queue already empty.
Choose operation : 4
 */