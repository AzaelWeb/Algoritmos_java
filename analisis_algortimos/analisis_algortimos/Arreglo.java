import java.util.*;

public class Arreglo {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      //arreglo de 10 posiciones
      int arreglo[] = new int [10];
      int iterador = 0;

      while(iterador < arreglo.length){
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        boolean numeroAceptado = true;

        //Ciclo for que comprueba que el numero es igual
        for(int i = 0; i<iterador; i++){
          if(arreglo[i] == numero ){

            numeroAceptado = false;
            System.out.println("El numero "+numero+" ya existe ingresa otro numero");
          }
        }
        //Condicion para aceptar el numero e incrementar en 1 nuestro iterador del while
        if(numeroAceptado){
          arreglo[iterador] =numero;
          iterador++;
        }

      }
      // sc.close();
      //Los numeros recorridos del arreglo
      System.out.println("___Numeros del arreglo___");
      for(int j=0; j<arreglo.length; j++ ){
        System.out.println(arreglo[j]);
      }
      
    }
  

   
}
