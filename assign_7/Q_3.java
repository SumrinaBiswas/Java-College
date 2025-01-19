/* Find length of a string taken from keyboard and also find the length of that string except front and end spaces. */

import java.util.*;

class parent {
    parent(String str){
        
        System.out.println("Length of the string : "+str.length());

        String trimmed = str.trim();   //  only remove front and end spaces
        System.out.println("Length of the string : "+trimmed.length());
    }
    void removespace(String str)
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
            
            System.out.println("Length of the string : "+ count);
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        parent p =new parent(str);
        p.removespace(str);
    }
}
