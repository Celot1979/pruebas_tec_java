package Prueba_Tec_9_reverse_cadena;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la palabra" + "\n");
		String cadena = teclado.next();
		StringBuilder reversed = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversed.append(cadena.charAt(i));
        }
        System.out.println(reversed);
		

	}

}
