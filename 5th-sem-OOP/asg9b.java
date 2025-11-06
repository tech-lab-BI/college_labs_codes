public class asg9b {
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        try {
            arr[6] = (1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1st catch : "+e);
            throw e;
        }
        catch (Exception e) {
            System.out.println("2nd catch block"+e);
            // throw e;
        }
    }
}
//The Rule: Specific Exceptions Must Come Before General Ones
/*
1st catch : java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
 */