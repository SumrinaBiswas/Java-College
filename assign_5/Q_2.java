/* Create a class which contains an inner class.  Show that inner class can use member of outer class directly, but Outer class can use
 member of Inner class only through its object. Check the name of class file, you created */

class outer {
    int a = 10;
    void show(){
        System.out.println("Outer class");
    }

    class inner {
        int b = 365;
        private String msg = "I'm Innerclass";
        void show1(){
            System.out.println("Accesing outer class member a = "+a); // accessing outer class member  without making an object
        }
        void config(){
            System.out.println("Inner class method");
        }
    }

    void inneraccesss ()
    {
        inner i = new inner();           // making an object of inner class then accsessed by outer class
        System.out.println("Inner class access --->"+ i.msg + i.b);
    }

}
public class Q_2 {
    public static void main(String[] args) {
        outer ob1 = new outer();
        ob1.show();

        outer.inner ob2 = ob1.new inner();
        ob2.show1();
    }
}
