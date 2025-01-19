
class Parent {

    void show()
    {
        System.out.println("Parent class");
    }

}
class Child1 extends Parent
{
    //super.show();
    @Override
    void show()
    {
        System.out.println("Child class - 1");
    }
} 
class Child2 extends Parent
{
    //super.show();
    @Override
    void show()
    {
        System.out.println("Child class - 2");
    }
} 
class Child3 extends Parent
{
    //super.show();
    @Override
    void show()
    {
        System.out.println("Child class - 3");
    }
} 

public class Q_5 {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        Child3 c3 = new Child3();
        
        p.show();
        c1.show();
        c2.show();
        c3.show();
    }

}
