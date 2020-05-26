
import java.util.Scanner;


public class Anios {
     
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int a;    
        int b;    
       
        System.out.print("Dame tu edad  ");  
        a = entrada.nextInt();        
        if(a!=18)
        System.out.println("que paso master, aun no puedes comprar licor");
        else
        System.out.println("saca los cigarros");
    }
}
