package Prueba_Tec_4_Anagrama;
/*
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */
public class Anagrama {

	public static void main(String[] args) {
		String str1 ="amor";
		String str2 ="mora";
		Convertir c = new Convertir();
		
		if(c.sonAnagramas(str1,str2)) {
			System.out.println("Las cadenas son anagramas");
		}else {
			System.out.println("Las cadenas no son anagramas");
		}
		
		

	}

	

}
