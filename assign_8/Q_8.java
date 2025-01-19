/*  Write a program that takes one string and two integers as command line argument and prints the reverse of the substring of
 the string specified by the two numbers. The program should handle all possible exception that may arise due to bad input */

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class Q_8 {
    public static void main(String[] args) {
        
        String st = args[0];
        int i = Integer.parseInt(args[1]);
        int j = Integer.parseInt(args[2]);
        try{
            if(args.length != 3)
            {
                System.out.println("Provide 3 arguments!!");
            }
            if(i<0 || i>=j || j>st.length()){
                throw new IndexOutOfBoundsException("Invalid index");
            }
            
            System.out.println("String is : "+st);
            String sub = st.substring(i,j);
            System.out.println("Substring : "+sub);
            String rev = new StringBuilder(sub).reverse().toString();
            System.out.println("Reverse String : "+rev);
        }
        catch(NumberFormatException e2){
            System.out.println("Error : "+e2.getMessage());
        }
        catch(IndexOutOfBoundsException e1){
            System.out.println("Error : "+e1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
