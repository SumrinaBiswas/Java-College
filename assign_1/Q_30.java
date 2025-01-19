/*  Write a Java Program to display the sequence A1, B2, C3, ....Y25, Z26, A1, B2,........ */

//package assign_1;
import java.util.*;
public class Q_30 {
    public static void main(String[] args) {
        System.out.println("Enter range : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0; i<a; i++)
        {
            char c = (char)('A'+ (i%26));
            int num = (i+1)%26;
            System.out.print(c+""+ num+", "); // "" before ((i%26)+1) is mandatory
        
        }
    }
}
