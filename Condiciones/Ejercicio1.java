package Condiciones;
import javax.swing.*;
/**Ejercicio 1:
 * Leer dos valores numéricos enteros e informar su cociente.
 */
public class Ejercicio1 {
    public static void main(String[]args){
        int a,b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));

        //Comprobar si el denominador es igual 0 
        if(b == 0){
            JOptionPane.showMessageDialog(null,"No se puede dividir entre cero","Ha ocurrido un error!", JOptionPane.ERROR_MESSAGE);

        }else{
            double cociente = a / b;
            System.out.println("El cociente es "+cociente);
        }
    }
}
