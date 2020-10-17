package Condiciones;
import javax.swing.*;
/*Ejercicio 2:
Dado un valor numérico entero, informar si es par o impar. */
public class Ejercicio2 {
    public static void main(String[]args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        if( n % 2  == 0){
            JOptionPane.showMessageDialog(null,n + " es par ");
        }else{

            JOptionPane.showMessageDialog(null,n + " es impar");
        }
    }
}
