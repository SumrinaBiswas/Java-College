/*  Write a Java Program to convert a binary number to decimal number and vice versa */
import java.lang.Math;
import java.util.*;
class convert{

    double binaryToDecimal(int b){
        int temp = b;
        double dec = 0;
        int base = 0;
        while(temp>0){
            int r = (temp % 10);
            dec = dec + (r * (Math.pow(2,base)));
            temp = temp/10;
            base = base+1;
        }
        return dec;
    }

    void decimalToBinary(int d){

        int[] arr = new int[64];
        int t =d;
        int i =0;
        while(t>0){
            arr[i] = t%2;
            t = t/2;
            i++;
        }
        for(int j=i-1; j>=0; j--)
        {
            System.out.print(arr[j]);
        }
    }
}

public class Q_27 {
    public static void main(String[] args) {
        convert con = new convert();
        System.out.println("1.Binary to Decimal \n2.Decimal to Binary");
        System.out.print("Enter choice : ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i==1){
            System.out.println("Enter a binary number :");
            int b = s.nextInt();
            double dec = con.binaryToDecimal(b);
            System.out.println("Decimal : "+dec);
        }
        else if(i==2){
            System.out.println("Enter a decimal number :");
            int b = s.nextInt();
            con.decimalToBinary(b);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
