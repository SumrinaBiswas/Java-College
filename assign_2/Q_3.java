// Write a program to find Area and Volume of Cone Using Constructors - Keyboard Input or Command Line Input.

import java.util.*;

public class Q_3 {
    double a,b;
    public Q_3(double r,double l) {
        this.a = r;
        this.b = l;
    }

       public void circum(double r){
            System.out.println("Circumfearence is : "+ (2* Math.PI * r));
        }

        public void khetro(double r,double l){
            System.out.println("Area is : "+ (Math.PI * r * (r+l)));
        }

}
 class cone{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter radius : ");
        double ra = s.nextDouble();
        System.out.print("enter height : ");
        double l = s.nextDouble();
        Q_3 c = new Q_3(ra,l);
        c.khetro(ra,l);
        c.circum(ra);
        System.out.println(c.a);

    }
}

