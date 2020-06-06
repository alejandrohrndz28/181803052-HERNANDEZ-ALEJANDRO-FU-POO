
import java.util.Scanner;


public class TarjetaMain {
   
    public static void main(String[] args) {

        Tarjeta tarjeta; 

        Scanner dato = new Scanner(System.in);

        int nCuenta;
        int nip;

        int opcion;

        System.out.print("Ingrese el numero de cuenta: ");
        nCuenta = dato.nextInt();

        System.out.print("Ingrese su NIP: ");
        nip = dato.nextInt();

        tarjeta = new Tarjeta().verificarCuenta(nCuenta, nip); 
        tarjeta.verificarCuenta(nCuenta, nip);

        do { 
            System.out.println("1-Hacer Deposito");
            System.out.println("2-Hacer un Retiro");
            if (tarjeta.apartado > 0) {
                System.out.println("3-Eliminar apartado");
            } else {
                System.out.println("3-Crear apartado");
            } 
            System.out.println("4-Imprimir datos de la Cuenta");
            System.out.println("5- mostrar datos de la cuenta");
            System.out.println("6- salir");
            System.out.println("Que mivimiento deseas realizar: ");
                opcion = dato.nextInt();
            
            switch (opcion) {

                case 1:
                    
                    System.out.println("\nIngrese la cantidad que quiere depositar: ");
                    tarjeta.depositar(dato.nextDouble());
                    System.out.println("Se han depositado correctamente");
                    
                    break;
                case 2:
                    double retirar;
                    System.out.println("\nIngrese la cantidad que quiere retirar: ");
                    retirar = dato.nextDouble();
                    tarjeta.retirar(retirar);
                    
                    
                    break;
                case 3:
                       if (tarjeta.apartado > 0) {
                           tarjeta.eliminarApartado();
                        System.out.println("Apartado Eliminado");
                    } else if (tarjeta.apartado == 0) {
                        System.out.println("Cuanto quiere apartar");
                        double apartar;
                        apartar = dato.nextDouble();
                        tarjeta.crearApartado(apartar);
                    }
                    break;
                case 4:
                    System.out.println("\nApartado Eliminado");
                    tarjeta.eliminarApartado();
                    break;
                case 5:
                    System.out.println(tarjeta.toString());
                    break;
                case 6:
                    System.out.println("\nRegrsa pronto");
                    break;
                default:
                    System.out.println("\nNo existe esa opcion");
                    break;
            }
        } while (opcion != 6);

    } 
}
