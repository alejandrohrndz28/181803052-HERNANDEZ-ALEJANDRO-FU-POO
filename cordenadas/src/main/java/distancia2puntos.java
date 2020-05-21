
import java.util.Scanner;
import java.math.*;


public class distancia2puntos {
    
    
    public static void main(String args[])
    {
       Scanner entrada = new Scanner(System.in);
        int xp1, xp2 , yp1, yp2;
        
        System.out.println("Programa para calcular la distancia entre dos puntos\n \n");
        
        System.out.println("ingresa la abscisa de el primer punto:\n");
        xp1 = entrada.nextInt();
        System.out.println("ingresa la ordenada de el primer punto:\n");
        yp1 = entrada.nextInt();
        System.out.println("ingresa la abscisa de el segundo punto:\n");
        xp2 = entrada.nextInt();
        System.out.println("ingresa la abscisa de el segundo punto:\n");
        yp2 = entrada.nextInt();
        
        System.out.println("La distancia entre los dos puntos es: "+ Math.sqrt(Math.abs((xp2-xp1)*(xp2-xp1)+((yp2-yp1)*(yp2-yp1)))));
    }
}

    

