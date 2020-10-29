package Ciclos;
import java.util.*;
import javax.swing.*;
/*Ejercicio 1:
 Programa que ordena alfabeticamente el nombre de frutas*/
public class Ejercicio1{
    public static void main(String[]args){
        ArrayList <String> frutas = new ArrayList<String>();
      
      int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de frutas a capturar"));
     
      //Agregar frutas
       
      for(int i=0; i<n; i++){
          String nombreFruta = JOptionPane.showInputDialog("Ingresa el nombre de la fruta");
          frutas.add(nombreFruta);
      }

      Collections.sort(frutas);

      for (String j : frutas) {
            System.out.println(j);
      }
     

        
    }
}
