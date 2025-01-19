/*  Show that the String object is immutable but StringBuffer type object is mutable. */

public class Q_7 {
    public static void main(String[] args) {
        String str = "Sumrina";
        System.out.println("original string : "+str);
       
        // Attempt to modify the string
        str.concat(" 2004");
        System.out.println("After concatenation attempt: " + str);
        //String res = str.concat("2004");
       //System.out.println(res);
        if(str.equals("Sumrina"))
        {
            System.out.println("no change : String is immutable\n");
        }
        else{
            System.out.println("String is mutable \n");
        }

        System.out.println("========StringBuffer=======");
        StringBuffer s = new StringBuffer("fagun");
        System.out.println("original string : "+s);
        s.append("2003");
        System.out.println("After concatenation attempt: " + s);
        if(s.equals("fagun"))
        {
            System.out.println("no change");
        }
        else{
            System.out.println("StringBuffer is mutable");
        }

    }
    
}