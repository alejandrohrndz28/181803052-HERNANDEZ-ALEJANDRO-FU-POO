
public class BancoMain {
    public static void main (String args[])
    {
        tarjetas morada = new tarjetas();
        morada.tipo = "Tarjeta morada";
        morada.cliente="universal";
        morada.porcentaje = 9;
        morada.puntos=150;
        

        tarjetas estudiante = new tarjetas();
        estudiante.tipo = "Tarjtea de estudiante";
        estudiante.cliente="exclusiva estudiantes";
        estudiante.porcentaje = 3;
        estudiante.puntos=200;

        tarjetas especial = new tarjetas();
        especial.tipo = "Tarjeta Búho Especial";
        especial.cliente="standar";
        especial.porcentaje = 12;
        especial.puntos=300;

        tarjetas docente = new tarjetas();
        docente.tipo = "Tarjeta Docente";
        docente.cliente="exclusiva docentes";
        docente.porcentaje = 3;
        docente.puntos=100;

        tarjetas oro = new tarjetas();
        oro.tipo = "Tarjeta Búho Blanco de Oro";
        oro.cliente="Alumnos VIAP";
        oro.porcentaje = 15;
        oro.puntos=400;
        
         System.out.println(morada.toString());
        System.out.println(estudiante.toString());
        System.out.println(especial.toString());
        System.out.println(docente.toString());
        System.out.println(oro.toString());

    }
}
