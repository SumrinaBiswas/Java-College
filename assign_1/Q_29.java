/* Write a Java Program to display the sequence AMM, COO, EQQ ,.......... */

import java.util.Scanner;

public class Q_29 {
    public static void main(String[] args) {
        System.out.println("Enter range : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i =0; i<26;i=i+2){
            char c = (char)('A'+((i)%26));
            char d = (char)('M'+((i)%26));
            System.out.print(c+""+d+""+d+",");
            //System.out.println(i%26);

        }
    }
}
