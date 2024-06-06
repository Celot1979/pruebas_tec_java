package Prueba_Tec_10_Numero_Mayor;

import java.util.Scanner;

//Crear un programa que lea una lista de números y encuentre el mayor.
public class Numero_Mayor {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Cuantos números vas a introducir: ==> ");
		int cantidad = teclado1.nextInt();
		int [] Array = new int[cantidad];
		for(int i = 0; i<cantidad;i++) {
			System.out.println("Ingrese el número #" + (i + 1) + ": ");
			Array[i] = teclado1.nextInt();
			
		}
		
		System.out.println("----------------------------------");
		int mayor =Array[0];
		
		for(int i = 1; i<cantidad;i++) {
			if(Array[i] > mayor )mayor = Array[i];
		}
		
		System.out.println("El valor mayor del Array es:     " + mayor);
		
	}

}
