package Reto_poligono;

public interface area {
	
	double calcular();

}
abstract class Triangulo implements area{

	public double calcular(double base,double altura) {
		// TODO Auto-generated method stub
		double resultado =(base*altura)/2;
		System.out.println("El resultado del area del triangulo es: " + resultado);
		return resultado;
	}
	
	private double base,altura;
	
}
class Cuadrado implements area{

	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
