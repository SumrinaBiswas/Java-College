/*  Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens. */

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread-1 is running and priority :"+getPriority());
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread-2 is running  and priority :"+getPriority());
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread-3 is running  and priority :"+getPriority());
    }
}
class Thread4 extends Thread{
    public void run(){
        System.out.println("Thread-4 is running and priority :"+getPriority());
    }
}
class Thread5 extends Thread{
    public void run(){
        System.out.println("Thread-5 is running and priority :"+getPriority());
    }
}
public class Q_3 {
    public static void main(String[] args) {
        Thread1 t1 = new  Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();

        t1.setPriority(2);
        t2.setPriority(10);
        t3.setPriority(1);
        t4.setPriority(6);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
