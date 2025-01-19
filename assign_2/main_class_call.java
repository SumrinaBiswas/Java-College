
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


