package Aritmeticos;
import java.util.*;
/**Ejercicio 8 Construir un programa  que calcule y muestre  por pantalla raices de la ecuacion de segundo grado
 *  de coeficientes reales
 * ax² +bx+c = 0
 */
public class Ejercicio8 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double x1,x2;
        

        System.out.println("Ingresa el coeficiente de (a)");
        a = sc.nextDouble();
        System.out.println("Ingresa el coeficiente de (b)");
        b = sc.nextDouble();
        System.out.println("Ingresa el coeficiente de (c)");
        c = sc.nextDouble();

        x1 = (-b+Math.sqrt(Math.pow(b,2) - (4*a*c)) / (2*a));
        x2 = (-b-Math.sqrt(Math.pow(b,2) - (4*a*c)) / (2*a));

        sc.close();

        System.out.println("Resultado 1: " +x1);
        System.out.println("Resultado 2: " +x2);
        
    }

}
