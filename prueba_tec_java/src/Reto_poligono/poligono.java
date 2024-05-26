package Reto_poligono;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class poligono {

	public static void main(String[] args) {
		Calculadora nu = new Calculadora();
		
		

	}
	public class Calculadora implements area{

		public double triangulo(double base, double altura) {
			// TODO Auto-generated method stub
			double resultado =(base*altura)/2;
			System.out.println("El resultado del area del triangulo es: " + resultado);
			return resultado;
		}

		public double cuadrado(double l1) {
			double resultado = l1 * 2;
			System.out.println("El resultado del area del cuadrado es: " + resultado);
			return resultado;
		}

		public double rectangulo(double l1, double l2) {
			// TODO Auto-generated method stub
			double resultado = l1 * l2;
			System.out.println("El resultado del area del Rectangulo es: " + resultado);
			return resultado;
		}
		
	}

}
