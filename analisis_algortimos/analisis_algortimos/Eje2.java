/*2.Ingresa por teclado 5 temperaturas en grados Celsius,
se desea saber lo siguiente
- La cantidad de temperaturas mayores o iguales a 30°c
- La cantidad de temperaturas menores a 30°c
- Y la temperatura promedio */
import java.util.*;

public class Eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperaturas []  = new int[5];
        int conteoMayores = 0,conteoMenores = 0,contador=0;
        float suma = 0, promedio = 0;

        for(int i = 0; i<temperaturas.length; i++){

            System.out.println("Ingresa la temperatura numero " +(i+1));
            temperaturas[i] = sc.nextInt();
            contador++;


            if(temperaturas[i] >= 30){
                conteoMayores++;
            
            }else{
                conteoMenores++;
            }

            suma +=temperaturas[i];
            promedio =  suma / contador;
            

            
        }
       
        sc.close();
        System.out.println("Temperaturas mayores o iguales a 30°c :"+conteoMayores);
        System.out.println("Temperaturas menores a 30°c "+conteoMenores);
        System.out.println("Temperatura promedio " + promedio);
    }
}
