// Create a class; put a method inside this class which will return a class reference return same class and/or different class object.

class A {
    
    A meth(A obj)
    {
        return (this);
    }
    A meth2A(){
        return (new B());
    }

}
class B{
    void meth(){
        System.out.println("Class - B");
    }
}

public class Q_7{
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        A ref = ob.meth(ob);
        System.out.println(ref);
        ob.meth2A();
    }
}