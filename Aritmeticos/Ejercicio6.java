package Aritmeticos;
import java.util.*;
/**Ejercicio 6 Hacer un programa que calcule el cuadrado  de una suma
 * (a+b)² = a² + b² + 2ab
 */
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        double cuadradoSuma;

        System.out.println("Ingresa el valor de a");
        a = sc.nextInt();
        System.out.println("Ingresa el valor de b");
        b = sc.nextInt();

        cuadradoSuma = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
        sc.close();

        System.out.println("Resultado " +cuadradoSuma);

    }
}
