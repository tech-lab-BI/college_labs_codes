
import java.util.Scanner;

public class asg6g {
    static int max = 3;
    static int queue[]=new int[max];
    static int f=-1;
    static int r=-1;
    static boolean isFull(){
        if(r+1 == max || r+1 == f)
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
            f=r=0;
            queue[r]=val;
        }
        else if(!isFull()){
            queue[++r] = val;
        } else if(r+1 == max && f!=0){
            r=0;
            queue[r] = val;
        } else{
            System.out.println("Queue already full");
        }
    }
    static int deq(){
        if(isEmpty()){
            return -999;
        }
        else if(f == r){
            int x = queue[f];
            f=r=-1;
            return x;
        }
        else if(f+1 == max){
            int x = queue[f];
            f = 0;
            return x;
        }
        else{
            return queue[f++];
        }
    }
    static void display(){
        if(isEmpty()){
            System.out.println("Queue empty.");
            return;
        }
        if(f <= r){
            for(int i=f;i<=r;i++){
                System.out.print(queue[i]+" ");
            }
        }
        else{
            for(int i=f;i<max;i++){
                System.out.print(queue[i]+" ");
            }
            for(int i=0;i<=r;i++){
                System.out.print(queue[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circular Queue\n1. enqueue\n2. dequeue\n3. display\n4. exit");
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
Circular Queue
1. enqueue
2. dequeue
3. display
4. exit
Choose operation : 3
Queue empty.
Choose operation : 1
Enter value : 10
Choose operation : 1
Enter value : 20 
Choose operation : 1
Enter value : 30
Choose operation : 3
10 20 30 
Choose operation : 1
Enter value : 40
Queue already full
Choose operation : 2
10 removed from stack.
Choose operation : 3
20 30 
Choose operation : 1
Enter value : 40
Choose operation : 3
20 30 40 
Choose operation : 2
20 removed from stack.
Choose operation : 4
 */