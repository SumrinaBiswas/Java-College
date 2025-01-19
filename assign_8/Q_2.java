/* Write a program for multiple catch to fire ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both. */

//package assign_8;
import java.util.*;
public class Q_2 {
    public static void main(String[] args) {

        int[] arr =  new int[5];
        String[] st = new String[5];
        String s = "Sumrina";
        int a = 100;
        int b = 0;
        int c = 4;

        try{
            //int r = a/b;
            System.out.println("\n"+arr[5]);
            System.out.println(st[6]);
            System.out.println(s.charAt(10));
            System.out.println("Program execution continues...");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : "+e);
            System.out.println(e.getMessage());
        }
        catch(StringIndexOutOfBoundsException e1)
        {
            System.out.println(e1);
            System.out.println(e1.getMessage());
        }
        catch(Exception e2){
            System.out.println(e2.getMessage());
        }
        
    }
    
}
