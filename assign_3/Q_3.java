// Do the problem 2 for method overloading.
import java.util.Scanner;
import java.lang.Math;

class Box{

    

    void display(double side){
       
        System.out.println("Volume of Cube : " + side*side*side);
    }

    void display(double h,  double r){
    
        
        double v = (Math.PI * r * r * h) / 3;
        System.out.println("Volume of Cube : " + v);

    }
}

public class Q_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Box box = new Box();
        System.out.println("Enter Side : ");
        double side = s.nextInt();
        box.display(side);
        System.out.println("Enter radius : ");
        double r=s.nextInt();
        System.out.println("Enter hight : ");
        double h=s.nextInt();
        box.display(h,r); 
    }
}
