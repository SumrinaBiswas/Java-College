/* Write a program to show Fibonacci series up to n using recursion.  */

class fibo {
    int fib(int n){
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }

}
public class Q_20 {
    public static void main(String[] args) {
        fibo f = new fibo();
        for(int i=0;i<10;i++){
            System.out.print(f.fib(i)+" ");
        }
        System.out.println("factorial : "+f.fact(5));
    }
}
