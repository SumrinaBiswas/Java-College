/*  WAP to calculate GCD/HCF and LCM of n numbers.   */
import java.lang.Math;
import java.util.*;

class calculation{
    int gcd (int a, int b){
        int gc = 0;
        // for(int i=1; i<a && i<b; i++)
        // {
        //     if(a%i==0 && b%i==0){
        //         gc = i;
        //     }
        // }
        // return gc;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    int lcm (int a,int b){
        int lc = (a*b)/gcd(a,b);
        return lc;
    }
}
public class Q_25 {

    public static void main(String[] args) {
       
       calculation cal = new calculation(); 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = s.nextInt();
        
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter no-"+i+" : ");
            ar[i] = s.nextInt();
        }
        int result = ar[0];
        for(int i=1;i<n;i++){
            result = cal.gcd(result,ar[i]);
        }
        System.out.println("GCD is :"+result);
        int l = ar[0];
        for(int i=1;i<n;i++){
            l = cal.lcm(l,ar[i]);
        }
        System.out.println("lcm is :"+l);
    }
    
}
