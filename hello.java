
// // class one {
// //     void show(){
// //         System.out.println("Hiii");
// //     }
// // }
// // class two {
// //     int x = 8;
// //     void show1(two t){
// //         System.out.println("Same class call x - "+t.x);
// //     }
// //     public void display(one o){
// //         o.show();
// //         System.out.println(" sumu");
// //     }
// // }



// // public class hello {
// //     public static void main(String[] args) {
// //     //     /*
// //     //      * Add obj = new Add();
// //     //      * obj.jog();
// //     //      */

// //     //     int a = Integer.parseInt(args[0]);
// //     //     int b = Integer.parseInt(args[1]);
// //     //     System.out.println("Addition : " + (a + b));
// //     two t2 = new two();
// //     one o1 = new one();
// //     t2.show1(t2);
// //     t2.display(o1);

// //     }
// // }

// class parent {
//     {
//         System.out.println("Instance initializer from parent");
//     }
//     parent(){
//         System.out.println("Constructor from parent");
//     }
//     static {
//         System.out.println("static from parent");
//     }
// }
// class child extends parent{
//     {
//         System.out.println("Instance initializer from child");
//     }
//     child(){
//         System.out.println("Constructor from child");
//     }
//     static {
//         System.out.println("static from child");
//     }
// }
// class demo{
//     {
//         System.out.println("Instance initializer from demo");
//     }
//     demo(){
//         System.out.println("Constructor from demo");
//     }
//     static {
//         System.out.println("static from demo");
//     }
// }
// public class hello{
//     public static void main(String[] args){
//         parent p = new parent();
//         child c = new child();
//         demo d = new demo();
//     }
// }
import java.util.*;
class hello{

    void bubble(char[] word){

        for(int i=0; i<word.length; i++)
        {
            for(int j=0;j<word.length-i-1; j++)
            {
                if(word[j] > word[j+1]){
                    char t = word[j];
                    word[j] = word[j+1];
                    word[j+1]= t;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(char w : word){
            System.out.println(w);
        }
    }
    char[] removespace(String w){
        char[] word = new char[w.length()];
        for(int i =0; i<w.length(); i++){
            if(w.charAt(i) != ' ')
            {
                word[i]=w.charAt(i);
            }
        }
        System.out.println(word);
        return word;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        hello q = new hello();
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        char[] g = new char[100];
        g = q.removespace(str);
        q.bubble(g);
    }
}
