/* Write a Java Program to display the sequence ABA, BCB, CDC, DED,… */

import java.util.Scanner;

public class Q_28 {
    public static void main(String[] args) {
        System.out.println("Enter range : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i =0; i<a;i++){
            char c = (char)('A'+((i)%26));
            char d = (char)('A'+((i+1)%26));
            System.out.print(c+""+d+""+c+",");
            //System.out.println(i%26);

        }
    }
}
