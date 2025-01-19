/* Assume that a bank maintains two kinds of account for its customers, one called savings account and other called current account.
 The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides
 cheque book facility but no interest. Current account holders should also maintain a minimum balance (say Rs. 1000) and if the bal
ance falls below this level a service charge is imposed (say Rs. 100). 
Create a class Account that stores customer name, account number and type of account. From this class derive two classes
 Curr_Acct and Savn_Acct respectively to make them more specific to their requirements. Include the necessary methods to
 achieve the following tasks:
 a.
 Accept deposit from a customer and update the balance.
 b. Display the balance.
 c.
 Compute and deposit interest.
 d. Permit withdrawal and update the balance.
 e.
 Check for minimum balance, impose penalty, if necessary, and update the balance.
 Use constructors to initialize the class members. */

import java.util.*;

class account {
    String name,type;
    int acc_no,bal,updated_bal;

    Scanner s = new Scanner(System.in);

    account(String name,String type,int no,int bal)
    {
        this.name = name;
        this.type = type;
        this.acc_no = no;
        this.bal = bal;
        //this.updated_bal = u;
    }
    void display()
    {
        System.out.println("Name: " + name + "\tType: " + type + "\tAccount Number: " + acc_no + "\nCurrent Balance: " + bal);
        if(bal<1000)
        {
            System.out.println("Balance of the bank is not maintained\nService Charge(100) is taken");
            bal = bal - 100;
            System.out.println("New balance : "+bal);
        }

    }
    void deposite ()
    {
        System.out.println("Enter amount for deposite : ");
        int amt = s.nextInt();
        System.out.println("Current Balance : "+bal);
        bal = bal + amt;
        System.out.println("After deposite : "+ bal);
        
    }

    void withdrawal ()
    {
        System.out.println("Enter amount for withdrawal: ");
        int amt = s.nextInt();
        System.out.println("Current Balance : "+bal);
        if(amt > bal){
            System.out.println("No sufficient Balance");
        }
        else{
            bal = bal -amt;
            System.out.println("After withdrawal : "+ bal);
        }
    }

}
class Savn_Acct extends account {    // here we need to apply a constructor matching with account constructor
    Savn_Acct(String name, String type, int no,int bal)
    {
        super(name, type, no, bal);   // override the parameters of the parent class
    }
    void interest (double r, int n, int time)
    {
        double interest = bal* Math.pow(1 + (r/n), (n*time)) - bal;
        bal = bal + (int)interest;
        System.out.println("Interest : "+ interest);
        System.out.println("After interest balance = "+bal);
    }

}
class Curr_Acct extends account{
    Curr_Acct (String name, String type, int no,int bal){
        super(name, type, no, bal);
    }
}

public class Q_3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("1.Savings Acc\n2.Current Acc");
        System.out.println("Enter Choice :");
        int ch = s.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Name : ");
            String name = s.next();
            System.out.println("Enter Acc no : ");
            int no = s.nextInt();
            System.out.println("Enter Balance : ");
            int bal = s.nextInt();
            Savn_Acct sav = new Savn_Acct(name, "SAvings Account", no, bal);
            int choice ;
            while(true)
            {
                System.out.println("1.Display\n2.Deposit\n3.Interest\n4.Withdrwal\n0.Exit");
                System.out.println("Enter choice : ");
                choice = s.nextInt();
                if(choice == 1)
                {
                    sav.display();
                }
                else if(choice == 2)
                {
                    sav.deposite();
                }
                else if(choice == 3)
                {
                    System.out.println("Rate = ");
                    double r = s.nextDouble();
                    System.out.println("No of times per year = ");
                    int n = s.nextInt();
                    System.out.println("Time = ");
                    int t = s.nextInt();
                    sav.interest(r, n, t);
                }
                else if(choice == 4)
                {
                   sav.withdrawal();
                }
                else if(choice == 0)
                {
                   break;
                }
                else
                {
                    System.out.println("Invalid");
                }

            }
           
        }
        else{
            System.out.println("Enter Name : ");
            String name = s.next();
            System.out.println("Enter Acc no : ");
            int no = s.nextInt();
            System.out.println("Enter Balance : ");
            int bal = s.nextInt();
            Curr_Acct curr = new Curr_Acct(name, "Current Account", no, bal);
            int choice ;
            while(true)
            {
                System.out.println("1.Display\n2.Deposit\n3.Withdrwal\n0.Exit");
                System.out.println("Enter choice : ");
                choice = s.nextInt();
                if(choice == 1)
                {
                    curr.display();
                }
                else if(choice == 2)
                {
                    curr.deposite();
                }
                
                else if(choice == 3)
                {
                   curr.withdrawal();
                }
                else if(choice == 0)
                {
                   break;
                }
                else
                {
                    System.out.println("Invalid");
                }

            }
        }
    }
}
