package Aritmeticos;
import java.util.*;
/*Ejercicio 3: Guillermo tiene N dólares.
Luis tiene la mitad  de lo que posee Guillermo
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen 
entre los tres. */
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);

        int dolaresGuillermo, dolaresLuis, dolaresJuan;

        System.out.println("Ingresa la cantidad en dolares de Guillermo");
        dolaresGuillermo = leer.nextInt();

        dolaresLuis = dolaresGuillermo / 2;

        dolaresJuan = (dolaresGuillermo + dolaresLuis) / 2;

        int dineroTotal = dolaresGuillermo + dolaresLuis + dolaresJuan; 

        leer.close();

        System.out.println("Dolares de Guillermo "+dolaresGuillermo + " Dolares Luis: "+dolaresLuis + " Dolares Juan: "+dolaresJuan);
        System.out.println("Total de dolares entre los tres: "+dineroTotal);
    }
}
