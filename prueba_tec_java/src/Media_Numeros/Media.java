package prueba_tec_java.src.Media_Numeros;
/*Escribir un programa que pida al usuario un número indeterminado de enteros y se realice la media del mismo */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Cuantos números tendrá la secuencia");
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.print("Introduzca el numero: ");
            int numero = entrada.nextInt();
            int suma = 0;
            int [] secuencial = new int [entrada.nextInt()];

            for (int i = 0; i < secuencial.length; i++) {
                suma += secuencial[i];
            }
        }


    }
}