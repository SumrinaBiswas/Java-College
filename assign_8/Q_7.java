/*Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch
 its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).*/

class MyException1 extends Exception{
    MyException1(String s) {
        super(s);
    }
}
class MyException2 extends Exception{
    MyException2(String s) {
        super(s);
    }
}
class myclass {
    void g() throws MyException1{
        throw new MyException1("Exceptin for g()");
    }
    void f() throws MyException2{

        try{
            g();
        }
        catch(MyException1 e1){
            System.out.println("f() is called in g()");
            System.out.println("Error msg : "+e1.getMessage());
            System.out.println(e1);
            throw new MyException2("Exception for f()");
        }
    }
}
public class Q_7 {
    public static void main(String[] args) {
        myclass m = new myclass();
        try{
            m.f();
        }
        catch(MyException2 e2){
            System.out.println("called and tested by main method and error msg is : "+e2.getMessage());
            System.out.println(e2);
        }
    }
}