/* Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another
 class having main method.  */


// Abstract class with no abstract methods
abstract class Base {
    public void displayMessage() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}

// Subclass of Base
class Derived extends Base {
    // No additional methods or overrides needed for this example
}

public class Q_1 {
    public static void main(String[] args) {

       // Base b = new Base(); // class is abstract , so it cam't be instantiated
       // b.displayMessage();
        // Creating an instance of Derived and calling the method
        Derived derived = new Derived();
        derived.displayMessage();
    }
}