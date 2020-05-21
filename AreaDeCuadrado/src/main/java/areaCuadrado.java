import java.util.Scanner;

public class areaCuadrado {
    
    public static void main (String args[]){
        Scanner leer=new Scanner(System.in);
  
        System.out.println("Dame un numero");
        double numero2=leer.nextDouble();
        System.out.println("El numero leido es:"+numero2);
        
        System.out.println( "El area del cuadrado es:"+ (numero2*numero2));
}
}
