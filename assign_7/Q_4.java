/* Check if "Tech" presents in "University of Technology" or not. If yes return its position. */


import java.util.*;

class parent {
    Scanner s = new Scanner(System.in);
    parent(){
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        System.out.println(str.contains("Tech"));
        int idx = str.indexOf("Tech");
        System.out.println("Found at : "+idx);

    }
    public static void main(String[] args) {
        parent p =new parent();
    }
}
