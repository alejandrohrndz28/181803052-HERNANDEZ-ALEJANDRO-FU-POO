
import java.util.Scanner;


public class ciclofor {
    
    public static void main (String args[])
    {
      Scanner leer=new Scanner(System.in);
        int dia = 0;
        System.out.println("*****Programa para saber cual es tu oroscopo******");
        System.out.println("ingresa tu mes de nacimiento");
        int mes;
        mes = leer.nextInt();
        String signo = "";
    switch (mes) {
        case 1:
            if (dia > 21) {
                signo = "Acuario";
            } else {
                signo = "Capricornio";
            }
            break;
        case 2:
                if (dia > 19) {
                    signo = "Pisis";
                } else {
                    signo = "Acuario";
                }
                break;
        case 3:
                if (dia > 20) {
                    signo = "Aries";
                } else {
                    signo = "Pisis";
                }
                break;
        case 4:
                if (dia > 20) {
                    signo = "Tauro";
                } else {
                    signo = "Aries";
                }
                break;
        case 5:
                if (dia > 21) {
                    signo = "Geminis";
                } else {
                    signo = "Tauro";
                }
                break;
        case 6:
                if (dia > 20) {
                    signo = "Cancer";
                } else {
                    signo = "Geminis";
                }
                break;
        case 7:
                if (dia > 22) {
                    signo = "Leo";
                } else {
                    signo = "Cancer";
                }
                break;
        case 8:
                if (dia > 21) {
                    signo = "VIRGO";
                } else {
                    signo = "LEO";
                }
                break;
        case 9:
                if (dia > 22) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
        case 10:
                if (dia > 22) {
                    signo = "Escorpion";
                } else {
                    signo = "Libra";
                }
                break;
        case 11:
                if (dia > 21) {
                    signo = "SAGITARIO";
                } else {
                    signo = "ESCORPION";
                }
                break;
        case 12:
                if (dia > 21) {
                    signo = "Capricornio";
                } else {
                    signo = "Sagitario";
                }
        break;
    }
}
    }
