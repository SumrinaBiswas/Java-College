/*Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
 no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () {  } in every class where you describe about the class and from main create object of each class and print
 each object. */

 class EMP {
    String name;
    int id;
    EMP(String  name,int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return ("Name : "+name+"\tID : "+id);
    }
 }

class Scientist extends EMP {
    int no , exp;
    Scientist(String name,int id,int num, int ex)     // here name and id both have to mention as it is a subclasss 
    {
        super(name, id);  // overriding
        this.no = num;
        this.exp = ex;
    }
    @Override
    public String toString()
    {
        return ("Name : "+name+"\tID : "+id+"\tNo. of publications : "+no+"\tExperience : "+exp);
    }
}

class Dscientist extends Scientist {
    String award;

    Dscientist(String n,int id,int number,int exp, String a)
    {
        super(n, id, number,exp);
        this.award =a; 

    }
    @Override
    public String toString()
    {
        return ("Name : "+name+"\tID : "+id+"\t\tNo. of publications : "+no+"\tExperience : "+exp+"\tAward : "+award);
    }
}

public class Q_4 {
    public static void main(String[] args) {
        EMP emp = new EMP("Rupa",112); // str should be in " "
        System.out.println(emp.toString());  // String toString() calling

        Scientist sc = new Scientist("Birag", 222, 10, 20);
        System.out.println(sc.toString());

        Dscientist ds = new Dscientist("Sumu",6 , 5, 12, "ABC");
        System.out.println(ds.toString());

        EMP sc1 = new Dscientist("mridla", 12, 2, 21, "piyal");
        System.out.println(sc1.toString()); 

    }
}
