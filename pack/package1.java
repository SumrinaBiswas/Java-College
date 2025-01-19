/* Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under pack
age pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of pre
vious class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
 members.  */

package pOne;

public class package1 {
    public int x =9;
    public void show(){
        System.out.println("from pOne");
    }
}
