package Aritmeticos;
import java.util.*;
/*Ejercicio 1:
 Hacer un programa que calcule e imprima la suma de tres calificaciones*/
public class Ejercicio1{
    public static void main(String[]args){
        Scanner calcular = new Scanner(System.in);
        int cal1,cal2,cal3;

        System.out.println("Ingresa la primera calificacion");
        cal1 = calcular.nextInt();
        System.out.println("Ingresa la segunda calificacion");
        cal2 = calcular.nextInt();
        
        System.out.println("Ingresa la tercera calificacion");
        cal3= calcular.nextInt();

        calcular.close();

        System.out.println("La suma es  "+(cal1+cal2+cal3));

        
    }
}