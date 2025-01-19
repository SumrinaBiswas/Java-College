/* Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by im
plementing the new interface and also inheriting from a concrete class.  In main (), create an object of derived class and call the
 methods. [do all without package statement] */

class concrete {

    void meth1(){
        System.out.println("It is method-1 from concreate class");
    }

}

interface parent1 {
    void meth2();
    void meth3();
}
interface parent2{
    int add();
    void meth4();
}

interface combined extends parent1,parent2{
    void meth5();
}
class child1 extends concrete implements combined{

   // super(meth1);  // no need to override this method as it is from concreate class

    public void meth2(){
        System.out.println("It is method-2");
    }
    public void meth3(){
        System.out.println("It is method-3");
    }
    public void meth4(){
        System.out.println("It is method-4");
    }
    public void meth5(){
        System.out.println("It is method-5");
    }
    public int add(){
        return 100;
    }
    
}
public class Q_3 {
    public static void main(String[] args) {
        child1 c = new child1();
        int num = c.add();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
        c.meth5();
        System.out.println("Number : "+num);
    }
}
