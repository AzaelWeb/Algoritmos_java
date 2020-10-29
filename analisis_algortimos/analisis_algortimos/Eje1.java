// 1.- Leer por teclado la 
// cantidad de producción de tomate de México, Usa y Canada y 
// determinar el porcentaje de produccion de cada pais
import java.util.*;
public class Eje1{
    public static void main(String[]args){
       float tMexico,tUsa,tCanada;
       int total;
       Scanner sc = new Scanner(System.in);

       System.out.println("Ingresa la cantidad de produccion de México");
       tMexico = sc.nextFloat();


       System.out.println("Ingresa la cantidad de produccion de Usa");
       tUsa = sc.nextFloat();

       System.out.println("Ingresa la cantidad de produccion de Canada");
       tCanada = sc.nextFloat();

       total = (int) ((tMexico * 100) /tMexico +(tUsa * 100) /tUsa + (tCanada * 100) /tCanada) / 3;

       
        sc.close();

    System.out.println("Produccion en México: "+(tMexico * 100)/tMexico/3+"%");
    System.out.println("Produccion en Estados unidos: "+(tUsa * 100)/tUsa/3+"%");
    System.out.println("Produccion en canada: "+(tCanada * 100)/tCanada/3+"%");
    System.out.println("Total de produccion: "+total+"%");

    }
}