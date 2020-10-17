package Aritmeticos;
import javax.swing.*;
/* /*Ejercicio 3: Se ingresa un valor numérico de 8 dígitos que representa una fecha con el siguiente
formato: aaaammdd. Esto es: los 4 primeros dígitos representan el año, los siguientes 2
dígitos representan el mes y los 2 dígitos restantes representan el día. Se pide informar
por separado el día, el mes y el año de la fecha ingresada 


El dato que ingresará al algoritmo es un valor numérico de 8 dígitos como el siguiente:
20081015. Si este fuera el caso, entonces la salida deberá ser:
dia: 15
mes: 10
anio: 2008*/
public class Ejercicio9{
    public static void main(String[]args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una fecha"));

        int div =  numero / 10000 ;
        int resto = numero % 10000;
        int mes = resto / 100;
        int dia = resto %100;
        // int dia = numero %1000;
        // int mes = dia % 100;

        System.out.println("año "+div +" dia "+dia+" mes " +mes);

    }
}
