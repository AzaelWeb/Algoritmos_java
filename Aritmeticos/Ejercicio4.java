package Aritmeticos;
import java.util.*;
/*Ejercicio 4: Una compañia de ventas de carros usados paga a su personal
de ventas un salario de $1000 mensuales mas una comision de $150 por cada carro vendido,
mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa a la computadora
los datos pertinentes. Hacer un programa que calcule  e imprima el salario mensual de un vendedor*/
public class Ejercicio4 {
    public static void main(String[]args){
        float salarioBase = 1000, cantidadCarrosVendidos;
        float precioCarro;
        Scanner calcular = new Scanner(System.in);

        System.out.println("Ingresa el precio del carro");
        precioCarro = calcular.nextInt();

        System.out.println("Ingresa la cantidad de carros vendidos");
        cantidadCarrosVendidos = calcular.nextInt();
        
        calcular.close();
        float comision = salarioBase + (cantidadCarrosVendidos * 150) + (0.05f * precioCarro *cantidadCarrosVendidos);

        System.out.println("Salario Mensual vendedor "+comision);
     
        

    }
    
}
