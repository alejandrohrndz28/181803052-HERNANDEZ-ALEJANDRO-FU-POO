
import java.util.Scanner;


public class Palabras {
     public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String palabra;
        int repetir;
        System.out.print("dame una palabra: ");
        palabra = scan.nextLine();
        scan.nextInt();
        System.out.print("cuantas veces quieres repetir la palabra: ");
        repetir = scan.nextInt();
        for(int i = 0; i < repetir; i++)
        {
            System.out.println(i + palabra);
        }
    }
}
