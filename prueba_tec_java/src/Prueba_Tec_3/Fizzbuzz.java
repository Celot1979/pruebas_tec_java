package Prueba_Tec_3;
/* * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 * 
 */
public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 100;
		int tres = numeros%3;
		int cinco = numeros%5;
		while(numeros !=0) {
			numeros = numeros-1;
			if(numeros == tres) System.out.println("fizz");
			else if(numeros == cinco)System.out.println("buzz");
			else if(numeros == tres && numeros == cinco)System.out.println("fizzbuzz");
			else System.out.println(numeros);
		}
				
		

	}

}
