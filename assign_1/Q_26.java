/* WAP to print all perfect numbers within a given range. */
import java.lang.Math;
import java.util.*;
class perfect{

    void perfectno(int n){
        int r =0;
        int temp = n;
        for(int i=1; i<n; i++){
            if(n%i==0){
                r = r+i;
            }
        }
        if(temp==r){
            System.out.println("Perfect number : "+r);
        }
        else{
            System.out.println(temp+" not perfect");
        }
    }
}

public class Q_26 {
    public static void main(String[] args) {
        perfect p = new perfect();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = s.nextInt();
        p.perfectno(n);
    }
}
