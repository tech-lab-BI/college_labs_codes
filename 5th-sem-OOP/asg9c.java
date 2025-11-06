public class asg9c {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println("1st charecter : "+s.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
/*
java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "s" is null
 */