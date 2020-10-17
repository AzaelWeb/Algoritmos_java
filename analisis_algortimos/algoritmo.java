package analisis_algortimos;

public class algoritmo{
    public static void main(String[]args){
        long tiempoInicio = System.currentTimeMillis();
        metodo();
        long tiempoTotal = System.currentTimeMillis() - tiempoInicio;
        System.out.println("Se ejecuto en "+tiempoTotal+" mili segundos");
    }

    //Metodo que cambia el orden del arreglo
    static void metodo(){

     int numeros[] = {1,2,3,4,5,6,7,8,9,10};

     for(int i=0; i<5; i++){

         System.out.println("Iteracion numero "+(i+1)+" = "+numeros[i]); //Primer numero, segundo numero, etc
         System.out.println("Iteracion numero "+(i+1)+" = "+(10-i)); //ultimo numero del arreglo, penultimo numero, etc
     }
    }
}