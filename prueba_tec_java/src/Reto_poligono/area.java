package Reto_poligono;

public interface area {
	
	double triangulo(double base,double altura);
	double cuadrado(double l1);
	double rectangulo(double l1,double l2);

}
/*abstract class Triangulo implements area{

	public double calcular(double base,double altura) {
		// TODO Auto-generated method stub
		double resultado =(base*altura)/2;
		System.out.println("El resultado del area del triangulo es: " + resultado);
		return resultado;
	}
	
	private double base,altura;
	
}
abstract class Cuadrado implements area{

	public double calcular(double l1) {
		// TODO Auto-generated method stub
		double resultado = l1 * 2;
		System.out.println("El resultado del area del cuadrado es: " + resultado);
		return resultado;
	}
	private double l1;
	
}
abstract class Rectangulo implements area{

	public double calcular(double l1, double l2) {
		// TODO Auto-generated method stub
		double resultado = l1 * l2;
		System.out.println("El resultado del area del Rectangulo es: " + resultado);
		return resultado;
	}
	private double l1,l2;
	
}*/
