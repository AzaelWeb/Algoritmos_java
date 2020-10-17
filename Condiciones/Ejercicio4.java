package Condiciones;
import javax.swing.*;
/*Ejercicio 4:
Leer tres valores numéricos enteros, indicar cuál es el mayor, cuál es el del medio y cuál,
el menor. Considerar que los tres valores serán diferentes. */

public class Ejercicio4 {
    public static void main(String[]args){
        int a,b,c, mayor,medio,menor;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero"));


        if( a > b && b > c){
            mayor = a;
            medio = b;
            menor = c;

            JOptionPane.showMessageDialog(null, "Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else if( a > c && c > b){

            mayor = a;
            medio = c;
            menor = b;
            JOptionPane.showMessageDialog(null," Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else if( b > a && a > c){
            
            mayor = b;
            medio = a;
            menor = c;
            JOptionPane.showMessageDialog(null," Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else if( b > c && c > a){
            mayor = b;
            medio = c;
            menor = a;
            JOptionPane.showMessageDialog(null," Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else if( c > a && a > b){
            mayor = c;
            medio = a;
            menor = b;
            
            JOptionPane.showMessageDialog(null," Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else if( c > b && b > a ){
            mayor = c;
            medio = b;
            menor = a;

            JOptionPane.showMessageDialog(null," Mayor: "+mayor+" Medio: "+medio+" Menor: "+menor);
        
        }else{
            JOptionPane.showMessageDialog(null,"Pusiste numeros iguales","error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
