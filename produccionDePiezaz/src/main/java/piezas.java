
import java.util.Scanner;


public class piezas {
    
    public static void main (String args[])
    {
        Scanner leer=new Scanner(System.in);
        int total;
        System.out.println("La fabrica desea saber como va la produccion\n\n");
        
        System.out.println("cuantas piezas en total salieron");
        int piezas=leer.nextInt();
        System.out.println("El numero de piezas es:"+piezas);
        System.out.println("cuantas piezas defectuosas en total salieron");
        int defectuosas=leer.nextInt();
        System.out.println("El numero de piezas es:"+defectuosas);
        
        total =(defectuosas*100)/piezas;
        System.out.println("El porcentaje de rechazo es de:"+total);
        
        
        
        
    }
}
