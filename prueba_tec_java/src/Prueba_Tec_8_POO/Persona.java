package Prueba_Tec_8_POO;

import java.util.Scanner;

public class Persona {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre= teclado1.next();
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Introduzca la edad: ");
		int edad= teclado2.nextInt();
		
		Define_Persona persona1 = new Define_Persona(nombre,edad);
		
		System.out.println("El nombre es: " + persona1.getNombre() + ". Su edad es: " + persona1.getEdad());
		

	}
	
	

}
