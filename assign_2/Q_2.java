// Write a program to find Area and Circumference of Cylinder Using Constructors - Keyboard Input or Command Line Input.

import java.util.*;

public class Q_2 {
    double a,b;
    public Q_2(double r,double l) {
        this.a = r;
        this.b = l;
    }

       public void circum(double r){
            System.out.println("Circumfearence is : "+ (2* Math.PI * Math.pow(r,2)));
        }

        public void khetro(double r,double l){
            System.out.println("Area is : "+ (2* Math.PI * r * (r+l)));
        }

}
 class cylinder{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter radius : ");
        double r = s.nextDouble();
        System.out.print("enter height : ");
        double l = s.nextDouble();
        Q_2 c = new Q_2(r,l);
        c.khetro(r,l);
        c.circum(r);

    }
}

