package Aritmeticos;
import java.util.*;

/*Ejercicio 5: La calificacion final de un estudiante de informatica
se calcula con base a las calificaciones de cuatro aspectos de su rendimiento
 academico:
 participacion, primer examen parcial, segundo examen parcial y examen final.
 Sabiendo que las calificaciones anteriores entran a la calificacion final
 con ponderaciones del 10%,25%, 25% y 40%, hacer un programa que calcule e imprima
 la calificacion final obtenida del estudiante */
public class Ejercicio5 {
    public static void main(String[]args){
        float participacion, primerExamen, segundoExamen, examenFinal;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la calificacion de la participación");
        participacion = leer.nextInt();

        System.out.println("Ingresa la calificacion del primer examen");
        primerExamen = leer.nextInt();

        System.out.println("Ingresa la calificacion del segundo examen");
        segundoExamen = leer.nextInt();

        System.out.println("Ingresa la calificacion del examen final");
        examenFinal = leer.nextInt();

        leer.close();

        float ponderacion = (participacion * 0.10f + primerExamen * 0.25f + segundoExamen * 0.25f + examenFinal * 0.40f);

        System.out.println("Calificacion final "+ponderacion);
    }
}
