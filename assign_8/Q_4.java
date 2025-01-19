/* Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try
catch clause to catch the exception. */

//package assign_8;

class errorclass {
    // errorclass(){
    //     System.out.println("object reference and initialize it to null");
        
    // }
    void meth(){
        System.out.println("Method calling");
    }
   
     public static void main(String[] args) {
        
        try{
            errorclass ec = null;
            ec.meth();
            System.out.println("prog continue");
        }
        catch (Exception e) {
            System.out.println("Error : "+e);
            System.out.println("Error msg : "+e.getMessage());
        }
    }
}
