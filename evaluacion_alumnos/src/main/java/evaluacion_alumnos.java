/* Copyright 2020 alejandro hernandez perez */

/*Un maestro necesita un programa para calcular el promedio final de alumnos.
Para ello evalúa tres rubros: cuestionario con una ponderación del 40% 
de la calificación, prácticas y tareas con una
ponderación de 40%, así como asistencia y participación 
con un 20% de la ponderación.
Leer la puntuación alcanzada en cada rubro y en base
a ello calcular y mostrar la calificación del alumno*/

import java.util.Scanner;


public class evaluacion_alumnos {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double cues, c, PyT, t, par, p, calificacion;
        System.out.println("End Game");
        

            System.out.println("cual es la calificación del alumno en su cuestionario");
            cues = scan.nextDouble();
            c = (cues * 40) / 10;
            System.out.println("cual es la calificación del alumno en sus prácticas y tareas");
            PyT = scan.nextDouble();
            t = (PyT * 40) / 10;
            System.out.println("cual es la calificación del alumno en sus participaciones");
            par = scan.nextDouble();
            p = (par * 20) / 10;
            calificacion = (c + t + p) / 10;
            System.out.println("La calificación final del alumno es: " + calificacion);
            
            /* Copyright 2020 alejandro hernandez perez */
        
    System.out.println("regrese pronto para reprobar a mas alumnos :)");
}
}

