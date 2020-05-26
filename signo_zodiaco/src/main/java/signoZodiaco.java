
 import java.util.Scanner;


public class signoZodiaco{
    public static void main (String args[])
    {
        Scanner leer=new Scanner(System.in);
        int dia;
               dia= 0;
        System.out.println("*****Programa para saber cual es tu oroscopo******");
        System.out.println("ingresa tu mes de nacimiento ");
        System.out.println("ejemplo, si eres de enero=1, si eres de mayo=5 ");
        System.out.println("ton´s cual es tu mes?  ");
        int mes;
        mes = leer.nextInt();
        
        System.out.println("Ingresa tu dia de nacimiento: ");
        dia=leer.nextInt();
       
        
    switch (mes) {
        case 1:
                if(dia<=20){
                    System.out.println("Capricornio");
                }
                else{
                    System.out.println("Acuario");
                }
                break;
            case 2:
                if(dia<=19){
                    System.out.println("Acuario");
                }
                else{
                    System.out.println("Piscis");
                }
                break;
            case 3:
                if(dia<=20){
                    System.out.println("Piscis");
                }
                else{
                    System.out.println("Aries");
                }
                break;
            case 4:
                if(dia<=20){
                    System.out.println("Aries");
                }
                else{
                    System.out.println("Tauro");
                }
                break;
            case 5:
                if(dia<=21){
                    System.out.println("Tauro");
                }
                else{
                    System.out.println("Geminis");
                }
                break;
            case 6:
                if(dia<=21){
                    System.out.println("Geminis");
                }
                else{
                    System.out.println("ancer");
                }
                break;
            case 7:
                if(dia<=23){
                    System.out.println("Cancer");
                }
                else{
                    System.out.println("Leo");
                }
                break;
            case 8:
                if(dia<=23){
                    System.out.println("Leo");
                }
                else{
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if(dia<=23){
                    System.out.println("Virgo");
                }
                else{
                    System.out.println("Libra");
                }
                break;
            case 10:
                if(dia<=23){
                    System.out.println("Libra");
                }
                else{
                    System.out.println("Escorpio");
                }
                break;
            case 11:
                if(dia<=22){
                    System.out.println("Escorpio");
                }
                else{
                    System.out.println("Sagitario");
                }
                break;
            case 12:
                if(dia<=21){
                    System.out.println("Sagitario");
                }
                else{
                    System.out.println("Capricornio");
                }
                break;
        }
    
}
    
}
