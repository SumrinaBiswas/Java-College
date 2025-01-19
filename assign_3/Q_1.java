//Create a class and test if method overloading holds good for return type of method or not.

class TestOverloading {
    // Method 1: returns an integer
    int display() {
        System.out.println("This is display() method returning an integer.");
        return 10;
    }

    // Method 2: returns a double, but has the same method signature (name and no parameters)
    double display() {
        System.out.println("This is display() method returning a double.");
        return 10.5;
    }

    public static void main(String[] args) {
        TestOverloading obj = new TestOverloading();
        obj.display();  // Trying to call the overloaded method
    }
}

//  Note : Method overloading cannot be achieved by just changing the return type of the methods. 
// The compiler needs to differentiate methods based on the method signature (name + parameter list). If two methods have 
// the same name and the same parameter list but different return types, the compiler will not be able to distinguish between
//  them and will throw an error.
// To successfully overload methods, you need to change the parameter list (either by number or type of parameters).

