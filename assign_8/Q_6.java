//package assign_8;

/* Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a per
son is less than Rs. 10,000 /-) and fire the exception. */
import java.util.*;
class PayOutOfBoundsException extends Exception{
    PayOutOfBoundsException(String s)
    {
        super(s); // override in constructor of subclass
    }
}
class myclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ");
        int i = sc.nextInt();

        try {
            if(i<10000)
            {
                throw new PayOutOfBoundsException("No sufficient salary"); // error msg is here, constructor calling
            }
        } 
        catch (Exception e) { // PayOutOfBoundsExceotion or Exception both can be used
            // TODO: handle exception
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
