
import java.util.Scanner;


public class Cubo {
    public static void main (String args[]){
    Scanner Sca = new Scanner (System.in);
    
    System.out.println("Programa que calcule el cubo de un numero\n \n");

    System.out.println("Ingrese el primer numero");
    int cubo = Sca.nextInt();

    int Resultado = cubo * cubo * cubo;
    System.out.println("El numero elevado al cubo es: " + Resultado);

}
}
