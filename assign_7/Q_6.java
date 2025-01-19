/*  Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middle
 name not presents ,it won't come) */

import java.util.*;

public class Q_6 {

    void password()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1st name : ");
        String s1 = s.next();
        System.out.println("Enter middle name , if not present then write 'NA'");
        String s2 = s.next();
        System.out.println("Enter last name : ");
        String s3 = s.next();
        System.out.println("Enter roll(greater than four digits) : ");
        String r = s.next();
        int r1 = r.length();
        if(s2.equals("NA"))
        {
            System.out.println("Password : "+s1.charAt(0)+s3.charAt(0)+r.substring(r1-4)); // begin index : r1-4
        }
        else
        {
            System.out.println("Password : "+s1.charAt(0)+s2.charAt(0)+s3.charAt(0) + r.substring(r1-4));
        }

    }
    public static void main(String[] args) {
        Q_6 q = new Q_6();
        q.password();
    }
    
}
