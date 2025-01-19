/*  Inherit a class from Thread and override the run( ) method. Inside run( ), print  name of thread , and then call sleep( ). Repeat this 
three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see 
what happens. */

//package assign_9;

class Thread1 extends Thread{
    
    Thread1(String s)   // // Constructor with a start-up message
    {
        super(s); // set thread name
        System.out.println("Start and Set Thread name : "+s);
    }
    public void run(){           // public is needed
        for(int i=0; i<3; i++){
            System.out.println("Name of Thread : "+ getName()); // only getName()
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        
    }
}

public class Q_1 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1("CustomThread");
        th1.start();

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
