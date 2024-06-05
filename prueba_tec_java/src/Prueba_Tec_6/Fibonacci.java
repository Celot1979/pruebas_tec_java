package Prueba_Tec_6;
//Escribir un programa que imprima los primeros 10 números de la serie de Fibonacci.
public class Fibonacci {

	public static void main(String[] args) {
		n1=0;
		n2=1;

		 for (int i = 2; i < 10; ++i) {
		 n3 = n1 + n2;
		 System.out.print(" " + n3);
		 n1 = n2;
		 n2 = n3;
		 }

	}
	
	static int n1, n2, n3;
	
	

}
