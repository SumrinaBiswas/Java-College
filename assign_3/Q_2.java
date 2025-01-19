//Overload the constructors for class Box for cube and cone and also display its volume.

import java.util.Scanner;
import java.lang.Math;
class Box {
    double h;
    double b;
    double l;
    double r;
    double v;

    public Box(double side){
        this.l= this.b=  side;
        this.h =  side;
        this.v = side*side*side;
        
    }

    public Box(double radius,double height){
        
        this.r = radius;
        this.h = height;
        this.v = (Math.PI * radius * radius * height) / 3;
    
    }
    void display()
    {
        System.out.println("\nVolume is : "+ v);
    }

}

class Q_2 {
    public static void main(String[] args) {
        System.out.println("For Cube : ");
        Box cube = new Box(4.45);
        cube.display();
        System.out.println("For Cone : ");
        Box cone = new Box(2.5,5.0);
        cone.display();

    }
}