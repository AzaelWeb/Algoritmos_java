package Condiciones;
import javax.swing.*;
/*Ejercicio 3: 
Leer dos valores numéricos enteros e indicar cuál es el mayor y cuál 
es el menor. Considerar que ambos valores son diferentes*/

public class Ejercicio3 {
    public static void main(String[]args){
        int n1, n2;
        int mayor, menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));


        if(n1 > n2 ){
            mayor = n1;
            menor = n2;
           JOptionPane.showMessageDialog(null, "Mayor: "+mayor);
           JOptionPane.showMessageDialog(null,"Menor: "+menor);

        }else{

            mayor = n2;
            menor = n1;
           JOptionPane.showMessageDialog(null, "Mayor: "+mayor);
           JOptionPane.showMessageDialog(null,"Menor: "+menor);
        }
    }
}
