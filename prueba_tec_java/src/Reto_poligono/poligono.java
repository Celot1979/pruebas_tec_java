package Reto_poligono;

import java.util.Scanner;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class poligono {
	
	public static void main(String[] args) {
		Triangulo t = new Triangulo(1, 2);
		t.area();
		Rectangulo r = new Rectangulo(2, 2);
		r.area();
		Cuadrado c = new Cuadrado(3);
		c.area();
		
	}
	
}
