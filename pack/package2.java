/* Create a class with variable(s) and method(s) (all will be default accessed) under package pOne. Now create a class under pack
age pTwo, which is subclass of firstly created class. In the method here (i.e. class of pTwo) call variable(s) and method(s) of pre
vious class (i.e. class of pOne). If errors come, rectify them. Now from Main (under working directory) access second class’s
 members.  */

package pTwo;
import pOne.package1;

public class package2 extends package1{
    public int y = 7;
    public void display(){
        System.out.println(x);
        System.out.println(y);
        show();
    }
}
