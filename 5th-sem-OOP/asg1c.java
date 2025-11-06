public class asg1c {
    public static void main(String[] args) {
        int n = args.length;
        System.out.println("Number of Argument : "+n);
        int i=0;
        while(i < n){
            System.out.print(args[i]+" ");
            i++;
        }
    }
}
/*output
 javac asg1c.java
 java asg1c hello world
 Number of Argument : 2
hello world
 */