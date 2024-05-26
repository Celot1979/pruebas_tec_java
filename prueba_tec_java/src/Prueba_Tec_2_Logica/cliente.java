package Prueba_Tec_2_Logica;

import java.util.List;

public class cliente {
	public cliente() {
		
	}
	
	public cliente(int id, String dni, String nombre, String apellido, List<Ticket> listaTickets) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTickets = listaTickets;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the listaTickets
	 */
	public List<Ticket> getListaTickets() {
		return listaTickets;
	}

	/**
	 * @param listaTickets the listaTickets to set
	 */
	public void setListaTickets(List<Ticket> listaTickets) {
		this.listaTickets = listaTickets;
	}

	private int id;
	private String dni,nombre,apellido;
	private List<Ticket> listaTickets;

}
