/* Write a program in Java which will read a string and rewrite it in the alphabetical     
order. For example, the word STRING
 should be written as GINRST. */

import java.util.*;
public class Q_8 {
    void bubble(char[] words)
    {
        for(int i = 0; i<words.length; i++)
        {
            for(int j =0; j< (words.length -i -1); j++)
            {
                if(words[j]>(words[j+1]) )
                {
                    char t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                }
            }
        }
        System.out.println("Sorted list : ");
        for(char wo : words)
        {
            System.out.println(wo);
        }
    }
    char removespace(String str)
    {
        char[] gtr = new char[100];
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) !=' ')     // " "---> it is for string and ' '---> it is for char
            { 
                gtr[i] = str.charAt(i);
                count++;
            }
            
        }
        System.out.println(gtr);
        return gtr[];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Q_8 q = new Q_8();
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        char[] g = new char[100];
        g = q.removespace(str);
        q.bubble(g);
    }
    
}
