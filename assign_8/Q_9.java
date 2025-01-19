/*  Write a demo program to illustrate ‘throws’ versus method overriding. */

import java.io.IOException; // mandatory for ioexception

class parent {
    void show() throws ArithmeticException{
        throw new ArithmeticException("Excption from parent class");
    }
}
class child extends parent{
    
    void show() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException("Exception from child class");
    }
}
public class Q_9 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        parent p1 = new child();
        try{
            p.show();
            c.show();
            p1.show();
        }
        catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
