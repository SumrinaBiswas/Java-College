/*  Write a program to handle the ArithmeticException.  */


//package assign_8;

public class Q_1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c = 4;
        try{
            int r = a/b;
            System.out.println("Result : "+r);
        }
        catch(Exception e){
            System.out.println("It's failed and cause : "+e);
            System.out.println("End of prog");
        }
    }
    
}
