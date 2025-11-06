public class asg9a{
    public static void main(String[] args) {
        try {
            System.out.println((6/0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
/*
java.lang.ArithmeticException: / by zero
 */