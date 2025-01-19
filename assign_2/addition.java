
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        
        Add obj = new Add();
        obj.jog();
         

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Addition : " + (a + b));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        System.out.println("1st no : "+n1);
        
        int n2 = Integer.parseInt(reader.readLine());
        System.out.println("2st no : "+n2);
        System.out.println("Add : "+(n1+n2));
    }

}

class Add {
    void jog() {
        System.out.println("Enter numbers: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("no : " + a);
        int b = s.nextInt();
        System.out.println("no : " + b);
        System.out.println("Addition : " + (a + b));
    }
}

/*
 * class Add_2 {
 * void jog()
 * {
 * int a = Integer.parseInt(args[0]);
 * int b = Integer.parseInt(args[1]);
 * }
 * }
 */