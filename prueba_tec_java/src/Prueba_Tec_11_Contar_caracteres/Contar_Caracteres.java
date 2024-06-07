package Prueba_Tec_11_Contar_caracteres;

import java.util.Scanner;

public class Contar_Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
	    // to see how IntelliJ IDEA suggests fixing it.
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Escribe tú frase, y conocerás la cantidad de caracteres que tiene    ");
	    String Cadena_con_Espacios = teclado.nextLine();
	    String Cadenas_Sin_Espacios = Cadena_con_Espacios.replaceAll("\\s", "");
	    char [] Array= Cadenas_Sin_Espacios.toCharArray();


	    for (int i =0; i <Array.length;i++){
	        contador+=1;

	    }

	    System.out.println(contador);

	}
	private String str;
	private static int contador=0;

}
