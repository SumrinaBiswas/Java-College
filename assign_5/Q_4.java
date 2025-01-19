/*Write a program to demonstrate anonymous inner class (using super class and interface) */

// Using Superclass
class A{
    void show(){
        System.out.println("Super class");
    }
}

//using interface
//@FunctionalInterface  //** 
interface B{
    void msg();
}

//using abstract class
abstract class C{
    abstract void config();
}

public class Q_4 {
    public static void main(String[] args) {
        
        A ob1 = new A(){

            void show(){
                System.out.println("Annonymous inner class by using Superclass");
            }
        };          // insert ; is must
        ob1.show();
        B ob2 = new B() {
            
           public void msg(){
                System.out.println("Annonymous inner class by using interface");
            }
        };
        ob2.msg();

        C ob3 = new C() {
            void config(){
                System.out.println("Annonymous inner class by using abstract");
            }
        };
        ob3.config();
    }
}
