
public class JuegoMain {
     public static void main (String args[])
    {
       Ak bronce;
         bronce = new Ak();
         
         bronce.tipo="bronce";
         bronce.cargador=5;
         bronce.precision=75;
         bronce.velocidad=5;
         bronce.precio=1000;
         bronce.danio=10;
        
        Ak plata = new Ak();
        plata.tipo = "Plata";
        plata.cargador = 8;
        plata.precision = 70;
        plata.velocidad = 4.5;
        plata.precio = 2300;
        plata.danio = 11;

        Ak oro = new Ak();
        oro.tipo = "Oro";
        oro.cargador = 10;
        oro.precision = 85;
        oro.velocidad = 4.3;
        oro.precio = 2500;
        oro.danio = 13;

        Ak diamante = new Ak();
        diamante.tipo = "Diamante";
        diamante.cargador = 20;
        diamante.precision = 95;
        diamante.velocidad = 3;
        diamante.precio = 4000;
        diamante.danio = 20;

        Ak adamantium = new Ak();
        adamantium.tipo = "Adamantium";
        adamantium.cargador = 30;
        adamantium.precision = 100;
        adamantium.velocidad = 1;
        adamantium.precio = 10000;
        adamantium.danio = 27;

        System.out.println(bronce.toString());
        System.out.println(plata.toString());
        System.out.println(oro.toString());
        System.out.println(diamante.toString());
        System.out.println(adamantium.toString());
       
    }
     
    }

