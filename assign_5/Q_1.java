//package assign_5;

/*Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of
the two classes and calculate their area.*/
import java.util.*;


interface Shape{
    double pie = 3.14;
    void area();
    //void show();
    Scanner s =new Scanner(System.in);
}
class Circle implements Shape {
    public void area()   // mention "public"--->must
    {
        System.out.println("enter radius : ");
        double r = s.nextDouble();
        double a = pie*r*r;
        System.out.println("Area = "+a);
    }
}
class Rectangle implements Shape {
    public void area()   // mention "public"--->must
    {
        System.out.println("enter length : ");
        double x = s.nextDouble();
        System.out.println("enter width : ");
        double y = s.nextDouble();

        double a = x*y;
        System.out.println("Rectangle Area = "+a);
    }
    
}
public class Q_1 {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.area();
        Shape obj2 = new Rectangle();
        obj2.area();

    }
}
