/*2.Ingresa por teclado 5 temperaturas en grados Celsius,
se desea saber lo siguiente
- La cantidad de temperaturas mayores o iguales a 30°c
- La cantidad de temperaturas menores a 30°c
- Y la temperatura promedio */
import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> temperatura = new ArrayList<Integer>();
        int mayor = 0,menor=0, promedio=0, suma=0,contador = 0;
        for(int i =0; i<5; i++){
            System.out.println("Ingresa las temperaturas");
            int n = sc.nextInt();
            temperatura.add(n);
            contador++;


            if(n >= 30){
                mayor++;
            }else{
                menor++;
            }
            suma+=n;
            promedio = suma / contador;

        }
        sc.close();
        System.out.println("Mayores a 30 grados" +mayor);
        System.out.println("Menores a 30 grados "+menor);
        System.out.println("Temperatura promedio  "+promedio);
        
    }
}
