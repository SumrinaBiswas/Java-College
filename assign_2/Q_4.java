// Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the
// instance variable and method from main.

class First{
    int x;

    void show(){
        System.out.println("It's Called");
    }
    public static void main(String[] args) {
        First obj = new First();

        obj.x = 3;
        System.out.println("x is : "+obj.x);

        obj.show();
    }
}


