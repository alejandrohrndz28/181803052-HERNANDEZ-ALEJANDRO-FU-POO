
import java.util.Scanner;


public class Nm {
    
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Dame el número con el que desea que comience la numeración: ");
        a = scan.nextInt();
        System.out.print("Dame el numero con el que desea que termine la numeración: ");
        b = scan.nextInt();
        while(a <= b)
        {
            System.out.println(a);
            a++;
        }
    }
}
