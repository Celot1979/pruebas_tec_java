package Prueba_Tec_4_Anagrama;

import java.util.Arrays;

public class Convertir {
	
	public Convertir() {
		
	}
	public static boolean sonAnagramas(String s12, String s22) {
		// Eliminamos espacios en blaco y convertimos todo a mayúsculas
		s1_nor= s12.replaceAll("\\s","").toLowerCase();
		s2_nor=s22.replaceAll("\\s","").toLowerCase();
		
		//Comprobamos la longitud de ambas cadenas
		if(s1_nor.length() != s2_nor.length()) {
			return false;
		}
		//Convertir las cadenas a arreglos de caracteres
		char[] charArray1= s1_nor.toCharArray();
		char[] charArray2= s2_nor.toCharArray();
		
		//Ordenar los arreglos de caracteres
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);

	}
	
	private static String s1_nor,s2_nor;
}
