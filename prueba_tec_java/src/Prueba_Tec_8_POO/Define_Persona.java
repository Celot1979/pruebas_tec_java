package Prueba_Tec_8_POO;

public class Define_Persona {
	public Define_Persona(String nombre,int edad) {
		this.nombre= nombre;
		this.edad=edad;
	}
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	private String nombre;
	private int edad;

}
