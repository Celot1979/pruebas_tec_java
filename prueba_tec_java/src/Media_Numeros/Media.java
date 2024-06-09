package prueba_tec_java.src.Media_Numeros;
/*Escribir un programa que pida al usuario un número indeterminado de enteros y se realice la media del mismo */
import java.util.ArrayList;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Cuantos números tendrá la secuencia");
        Scanner entrada = new Scanner(System.in);
        float cantidad_secuencia = entrada.nextInt();
        //System.out.println(cantidad_secuencia);
        float suma=0;
        for (float i =0; i< cantidad_secuencia;i++){
            System.out.println("Introduce los números que deseas para calcular la media");
            float secuencia = entrada.nextInt();
            suma+= secuencia;
        }
        System.out.println("La suma de la secuencía es : " +  suma);
        System.out.println("La cantidad de números de la secuencia  es : " +  cantidad_secuencia);
        System.out.println("La media de la secuencía es : " +  (suma/cantidad_secuencia));



    }
}