package Aritmeticos;
import java.util.*;
/*Ejercicio 7: Construir un programa
 que dado un numero total de horas devuelve el numero
 de semanas, dias y horas equivalentes.
 Por ejemplo, dado un total de 1000 horas
 debe mostrar 5 semanas, 6 dias y 16 horas */
public class Ejercicio7 {
    public static void main(String[]args){
        int totalHoras, semanas,dias,horas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el total de horas ");
        totalHoras = sc.nextInt();

        semanas = totalHoras / 168;
        dias = totalHoras % 168 / 24;
        horas = totalHoras % 24;
        sc.close();

        System.out.println(totalHoras +" horas equivalen a "+semanas+" semanas " +dias +" dias"+" y "+horas +" horas");

    }
}
