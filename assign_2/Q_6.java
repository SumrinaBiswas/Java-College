// Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object, (b) pass different
// class’s object

class first{
    int a =10;
    int b = 5;
    int val()
    {
        return (a+b);
    }

    
    int val_2(first a){                   //  passing same class object
       System.out.print("Same Class's obj passed : ");
       return 8;
    }

    void val_3(second b)                  // passing different class
    {

        System.out.println("Different class valid");
        System.out.println("Different class number : "+ b.y);
    }
}

class second{
    int y = 10;
    void B(second s){
        System.out.println("Different class's object called ");
    }
}

public class Q_6 {
    public static void main(String[] args) {
        first f = new first();
       int c = f.val();
       System.out.println(c);
       System.out.println(f.val_2(f));  //  passing same class object

       second s = new second();

       f.val_3(s);           // passing different class
    }
}
