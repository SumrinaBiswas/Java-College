//package assign_9;
/* Make several threads (say 5) with their names (implementing Runnable) set their priority and run them to see what happens. */

class Thread1 implements Runnable{
    public void run(){
        System.out.println("Thread-1 is running and priority :"+Thread.currentThread().getPriority());
    }
}
class Thread2 implements Runnable{
    public void run(){
        System.out.println("Thread-2 is running  and priority :"+Thread.currentThread().getPriority());
    }
}
class Thread3 implements Runnable{
    public void run(){
        System.out.println("Thread-3 is running  and priority :"+Thread.currentThread().getPriority());
    }
}
class Thread4 implements Runnable{
    public void run(){
        System.out.println("Thread-4 is running and priority :"+Thread.currentThread().getPriority());
    }
}
class Thread5 implements Runnable{
    public void run(){
        System.out.println("Thread-5 is running and priority :"+Thread.currentThread().getPriority());
    }
}
public class Q_4 {
    public static void main(String[] args) {
        Thread1 t1 = new  Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread5 t5 = new Thread5();

        Thread h1 = new Thread(t1);
        Thread h2 = new Thread(t2);
        Thread h3 = new Thread(t3);
        Thread h4 = new Thread(t4);
        Thread h5 = new Thread(t5);

        h1.setPriority(2);
        h2.setPriority(1);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        
    }
}
