/*  Write a program to take a sentence and convert it into string arrays and sort the words using any Sorting technique. */

import java.util.*;
class base {
     

    void bubble(String[] words)
    {
        for(int i = 0; i<words.length; i++)
        {
            for(int j =0; j< (words.length -i -1); j++)
            {
                if(words[j].compareTo(words[j+1]) > 0)
                {
                    String t = words[j];
                    words[j] = words[j+1];
                    words[j+1] = t;
                }
            }
        }
        System.out.println("Sorted list : ");
        for(String wo : words)
        {
            System.out.println(wo);
        }
    }
}
public class Q_5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String sen = s.nextLine();
        System.out.println("Sentence : "+sen);

        int i =0;
        String[] words = new String[100];
        /*for(i=0;i<sen.length();i++)
        {
          if()
        }*/
        words = sen.split("\\s+");   // Split the sentence into words using spaces as the delimiter
        System.out.println("\nWords in the sentence:");
        for (String w : words) {
            System.out.println(w);
        }
        base b = new base();
        b.bubble(words);
    }
}