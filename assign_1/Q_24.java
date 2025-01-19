/* WAP to print all Armstrong numbers within a given range */
import java.lang.Math;
import java.util.*;
class armstrong{
    void arm(int n){
        int temp = n;
        int temp1 = n;
        int i=0;
        int r = 0;
        while(temp!=0){
            r = temp %10;
            temp = temp/10;
            i++;
        }
        System.out.println("length : "+i);
        int rem;
        double sum =0;
        while(temp1!=0){
            rem = temp1%10;
            sum = sum + (Math.pow(rem,i));
            temp1 = temp1/10;
        }
        if(n==sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstromng");
        }
    }
}
public class Q_24 {
    public static void main(String[] args) {
       armstrong arm = new armstrong();
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter n : ");
        // int n = s.nextInt();
        arm.arm(153);
        arm.arm(120);
    }
}
