// See the problems below:
// Write a JAVA Program to make a Student class with proper attributes like roll no, name, stream, and college

import java.util.*;
class student {
    int roll;
    String name,stream,clg;

    student(int r){
        this.roll  = r;
    }
    student(int r,String n,String s,String c){
        this.roll = r;
        this.name = n;
        this.stream = s;
        this.clg = c;
    }
}
public class Q_8 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter name, roll, stream, clg name");
       
        String na = s.nextLine();
        int r = s.nextInt();
        String st = s.next();
        String cl = s.next();   // why nextLine() is not acceptable?
        

        student s1 = new student(r);
        student s2 = new student(r,na,st,cl);
        System.out.println("Student's Name : "+ s2.name +"\nRoll :"+s2.roll+"\nStream : "+s2.stream+"\nCollege : "+s2.clg);
    }
}
