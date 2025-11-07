class NumberOperations {
    int a;
    int b;

    public NumberOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Synchronization ensures both threads don’t access shared variables simultaneously, preventing race conditions.
    public synchronized void add() {
        int c = a;  // Copying instance variable values
        int d = b;
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {}
        int sum = c + d;
        System.out.println("Sum: " + sum);
    }

    // Method to increase values
    public synchronized void increase() {
        a += 5;
        b += 5;
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds
        } catch (InterruptedException e) {}
        System.out.println("Increased values -> a: " + a + ", b: " + b);
    }
}
class th1 extends Thread{
    NumberOperations np;
    public th1(NumberOperations np){
        this.np = np;
    }
    @Override
    public void run(){
        np.add();
    }
}
public class asg10b {
    public static void main(String[] args) {
        NumberOperations obj = new NumberOperations(10, 20);

        th1 t1 = new th1(obj);
        // Thread t1 = new Thread(() -> { obj.add(); });

        Thread t2 = new Thread(() -> { obj.increase(); }); // lambda expression

        t1.start();

        // try {
        //     // Ensure t1 finishes before t2 starts
        //     t1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        //     So System.out.println(e) gives you what happened, 
        //     while e.printStackTrace() gives you what, where, and how it happened.
        // }

        t2.start();
    }
}
