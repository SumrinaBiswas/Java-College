//package assign_7;

/* Take a sting from keyboard and convert into character array (new one). */

import java.util.*;

class base {
     
    base(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        System.out.println("String is : "+str);

        int i =0;
        char[] ar = new char[100];

        System.out.println("String characters : ");
        for(i=0;i<str.length();i++)
        {
           ar[i]=str.charAt(i);
            System.out.println(ar[i]);
        }
        //s.close(); // Close the scanner to prevent resource leaks
       // System.err.println(ar);
    }
   
    public static void main(String[] args) {
        base b = new base();
    }
}

