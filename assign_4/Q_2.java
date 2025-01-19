/* Create an abstract class with three abstract methods check whether you can we override only few methods (not all methods) in sub
class or not. */

abstract class Parent {

    abstract void display ();// no body
    abstract int num ();
    abstract float draw();
   
}

abstract class child2 extends Parent {
    @Override

    void display ()
    {
        System.out.println("Abstract class method in subclass");
    }
    float draw()
    {
        System.out.println("return float");
        return ((float) 5.5697855) ;
    }

}
class child3 extends child2 {  // it has to override all abstract methods otherwise it returns error
    
    @Override

    void display ()
    {
        System.out.println("Abstract class method in subclass child3");
    }
    float draw()
    {
        System.out.println("return float");
        return ((float) 4.5) ;
    }
    int num ()
    {
        return 100;
    }

}

class child1 extends Parent {  // it has to override all abstract methods otherwise it returns error
    
    @Override

    void display ()
    {
        System.out.println("Abstract class method in subclass");
    }
    float draw()
    {
        System.out.println("return float");
        return ((float) 5.5697855) ;
    }
    int num ()
    {
        return 12;
    }

}

public class Q_2 {
    public static void main(String[] args) {
        child1 c = new child1();
        c.display();
        c.num();
        c.draw();
        System.out.println("\n >>>> \n");
        System.out.println(c.draw());
        System.out.println(c.num());
        // child2 c2 = new child2();
        // c2.display();

        child3 c3 = new child3() ;
        c3.display();
        System.out.println(c3.draw());
        System.out.println( c3.num());
    }

}


