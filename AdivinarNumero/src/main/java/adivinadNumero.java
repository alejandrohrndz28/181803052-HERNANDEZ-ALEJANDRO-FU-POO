
import java.util.Scanner;


public class adivinadNumero {
    
     public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        int n=(int) (Math.random() * (100 - 1 + 1) + 1);
        int x;


        System.out.println("Programa para adivinar un numero entre el 1 al 100 \n\n");
        do{
            System.out.println("\nIngresa un numero: ");
            x=leer.nextInt();
            if(x<n){
                System.out.println("sirilio pasculio, tu numero es un poco mas grande");
            }
            else if(x>n){
                System.out.println("Nel pastel, tu numero es menor");
            }

        }while(x!=n);

        System.out.println("\nFelicidades es el numero correcto");
        System.out.println("\nEres grande");
    }
    
}
