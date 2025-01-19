//package assign_6;

/* Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/
 inherited block). */

class base {
    static{
        System.out.println("Static block from base class");
    }

    {
        System.out.println("Instance Initiallizer Block from base class");
    }
    
    base(){
        System.out.println("constructor block from base class");
    }
}
class child extends base{
    
    static{
        System.out.println("Static block from child class");
    }

    {
        System.out.println("Instance Initiallizer Block from child class");
    }

    child(){
        
        System.out.println("constructor block from child class");
    }

}

class base2{
    static{
        System.out.println("Static block from base class---2");
    }

    {
        System.out.println("Instance Initiallizer Block from base class--2");
    }
    
    base2(){
        System.out.println("constructor block from base class---2");
    }

}
public class Q_1 {
    public static void main(String[] args) {
        //base b = new base();
        child c = new child();
       
       
        //base2 b2 = new base2();
    }
}


/*
 OUTPUT for child class and order of this
 
Static block from base class                         //          and static block is executed at the time of class loading  
Static block from child class
Instance Initiallizer Block from base class
constructor block from base class
Instance Initiallizer Block from child class
constructor block from child class
 
*/

/*
 OUTPUT  for base and child

Static block from base class                        // static for base and child both are printed only once and have 1st priority 
Instance Initiallizer Block from base class             //          and static block is executed at the time of class loading
constructor block from base class
Static block from child class
Instance Initiallizer Block from base class
constructor block from base class
Instance Initiallizer Block from child class
constructor block from child class
 */

/*
 * 2nd OUTPUT for base, child, base2
 * 
    Static block from base class
Instance Initiallizer Block from base class
constructor block from base class
Static block from child class
Instance Initiallizer Block from base class
constructor block from base class
Instance Initiallizer Block from child class
constructor block from child class
Static block from base class---2
Instance Initiallizer Block from base class--2
constructor block from base class---2
 */

