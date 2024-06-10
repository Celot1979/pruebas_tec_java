package prueba_tec_java.src.Funcion_Numero_Menor;

import java.util.Arrays;

//Escribe una función que reciba por parámentro uns secuencia de números y que no halle el número menor.
public class Numero_Menor {
    public static void main(String[] args) {

        int [] secuencia = {30,16,99,6,12,125,20};
        menor(secuencia);
    }

    private static void menor(int[] secuencia) {
        Arrays.sort(secuencia);
        System.out.print("El número menor del arreglo es : " + secuencia[0] +  " Willa Maligana");
    }

}
