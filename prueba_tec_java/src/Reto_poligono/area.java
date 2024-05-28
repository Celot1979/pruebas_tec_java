package Reto_poligono;

public interface area {
	double CalculoArea();
	//Clase para el triángulo
	public abstract class triangulo implements area{
		private double base;
		private double altura;
		public triangulo(double base, double altura) {
			this.base=base;
			this.altura=altura;
			
		}
		public double CalculoArea() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	

}
