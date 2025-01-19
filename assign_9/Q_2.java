/*  Implement a class from Runnable and override the run( ) method. Inside run( ), print full qualified name of thread, and then call 
sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and 
main thread run to see what happens. */

class Thread1 implements Runnable{
    private String s;  // as runnable has no getName() method , so we need to declare it
    Thread1(String st)   // // Constructor with a start-up message
    {
        this.s = st;
        System.out.println("Start and Set Thread name : "+st);
    }
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("Name of Thread : "+ s); // only getName()
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Thread1 finished execution");
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1("CustomThread1");
        Thread t1 = new Thread(th1);
        t1.start();
        try{
            for(int i=0;i<3;i++){
                System.out.println("Main method thread "+(i+1));
                Thread.sleep(1000);
            }
        }
        catch(Exception e1)
        {
            System.out.println(e1.getMessage());
        }
        System.out.println("Main thread finished executed");
    }
}
