
import java.util.Scanner;


public class Numeros {
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int a;    
        int b;    
       
        System.out.print("Digite el primer entero: ");  
        a = entrada.nextInt();    
        System.out.print("Digite el segundo entero: "); 
        b = entrada.nextInt();    
        if(a<b)
        System.out.println("el primer valor es menor");
        else
        System.out.println("el segundo valor es mayor");
    }
    
}
