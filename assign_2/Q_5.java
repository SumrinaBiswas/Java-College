// Create a class; make its instance variable and method. Use them from main, declared in different class

class first{
    int x;

    void show(){
        System.out.println("It's Called");
    }
}
 public class Q_5{
    public static void main(String[] args) {
         first f = new first();
         f.x = 7;
         System.out.println("x is : "+f.x);
         f.show();
    }

 }