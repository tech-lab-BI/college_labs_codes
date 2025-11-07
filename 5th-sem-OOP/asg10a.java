class th1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread1>> "+i);
        }
    }
}
class th2 extends Thread{
    public void run(){
        for(int i=10;i>0;i--){
            if(i==6){
                try {
                    sleep(5000);
                } catch (Exception e) {
                    System.out.println("Exception raised : "+e);
                }
            }
            System.out.println("Thread2>> "+i);
        }
    }
}
public class asg10a{
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        
        t1.start();
        t2.start();

        // t1.run(); // also run with start() execution
        // t2.run();

    }
}
/*
Thread2>> 10
Thread2>> 9
Thread1>> 1
Thread2>> 8
Thread1>> 2
Thread2>> 7
Thread1>> 3
Thread1>> 4
Thread1>> 5
Thread1>> 6
Thread1>> 7
Thread1>> 8
Thread1>> 9
Thread1>> 10 // program wait 5000 mili Sec
Thread2>> 6
Thread2>> 5
Thread2>> 4
Thread2>> 3
Thread2>> 2
Thread2>> 1
 */