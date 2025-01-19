/* Write a program to fire any checked exception manually using ‘throw’ keyword. */

//package assign_8;

class NegetiveException extends Exception {
    public String getMessage(){   // public is required----but why?????
        return "Negetive value not accepted";
    }
}
class BoundaryException extends Exception{
    public String msg(String str){
        return "Can't cross lower limit";
    }
}
public class Q_5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        try {
            if((b-a)<0)
            {
                throw new NegetiveException();
            }

        } catch (NegetiveException e) {
            // TODO: handle exception
            System.out.println("Error : "+e.getMessage());
            System.out.println(e);
        }
    }
}
