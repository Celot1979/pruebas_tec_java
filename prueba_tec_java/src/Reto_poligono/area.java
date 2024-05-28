package Reto_poligono;

public interface area {

	public void area();
		

	}
	

class Triangulo implements area{
	public Triangulo(int base, int altura) {
		resultado = (base*altura)/2;
	}
	
	public void area() {
		
		System.out.println(resultado);
		
	}
	
	int base, altura,resultado;
	
}


class Rectangulo implements area{
    public Rectangulo(int base , int altura) {
    	resultado = (base*altura)/2;
    	
    }
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(resultado);
	}
	int resultado, base,altura;
	
}
	
class Cuadrado implements area{
	public Cuadrado(int lado) {
		resultado = lado * 2;
	}
	public void area() {
		// TODO Auto-generated method stub
		
	}
	int resultado,lado ;
	
}
	



