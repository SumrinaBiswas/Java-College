/* Write a program to fire the NegativeArraySize exception. */

//package assign_8;

public class Q_3 {
    public static void main(String[] args) {
       // int[] arr =  new int[-10]; // here compiler detect the error

        try{
            int[] arr =  new int[-10]; // now it detect error in catch block
            System.out.println("Array length : "+arr.length);
        }
        catch(NegativeArraySizeException e){
            System.out.println("Error : "+e);
            System.out.println("error msg : "+e.getMessage());
        }
    }
}
