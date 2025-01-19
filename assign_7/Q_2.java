/* Take a string from keyboard and a char array (of length 5). Now append the string to that char array. */

import java.util.*;

public class Q_2 {
    
    Scanner s = new Scanner(System.in);

    Q_2(){
        System.out.println("Enter a string : ");
        String str = s.nextLine();

        char[] ar = new char[100];
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter array element--"+i);
            ar[i] = s.next().charAt(0);         // charAt(i) gives error,  s.next().charAt(i) which will cause an IndexOutOfBoundsException when i exceeds 0. Instead, use s.next().charAt(0) to read a single character at each iteration.
        }
        System.out.println("Char Array --");
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter array element"+(i)+" = "+ar[i]);
            
        }
        String strar = new String(ar);  // convert ar to String
        System.out.println(strar);
        String result = str + strar;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Q_2 q = new Q_2();
    }

}
