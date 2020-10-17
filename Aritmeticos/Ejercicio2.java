package Aritmeticos;
import java.util.*;
/*Ejercicio2:
Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de su salario por hora */
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);

        int horasTrabajadas, salarioHora;

        System.out.println("Ingresa el total de horas a la semana");
        horasTrabajadas = leer.nextInt();

        System.out.println("Ingresa el salario por hora");
        salarioHora = leer.nextInt();

        int salarioSemanal = horasTrabajadas * salarioHora;
        leer.close();

        System.out.println("Tu salario es de : "+salarioSemanal);

    }
}
