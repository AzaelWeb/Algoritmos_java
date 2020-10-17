package analisis_algortimos;
import java.util.ArrayList;
import java.util.Collections;
public class ordenar {
  public static void main(String[]args){
    long tiempoInicial = System.currentTimeMillis();
    ordenamiento();
    long tiempoTotal = System.currentTimeMillis() - tiempoInicial;
    System.out.println("Se ejecuto en  "+tiempoTotal +" mili segundos");
  }  

  static void ordenamiento(){
    ArrayList <String> frutas =  new ArrayList <String>();

    frutas.add("Fresa");
    frutas.add("Arandano");
    frutas.add("Cereza");
    frutas.add("Naranja");

    Collections.sort(frutas);

    for(String i: frutas){
        System.out.println(i);
    }
  }
}
