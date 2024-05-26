package Prueba_Tec_2_Logica;

import java.util.Date;

public class Ticket {
	public Ticket() {
		
	}
	
	public Ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fecha) {
		super();
		this.numero = numero;
		this.fila = fila;
		this.asiento = asiento;
		this.precio = precio;
		this.fechaCompra = fechaCompra;
		this.fecha = fecha;
	}
	
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}
	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}
	/**
	 * @return the asiento
	 */
	public int getAsiento() {
		return asiento;
	}
	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the fechaCompra
	 */
	public Date getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	



	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio
				+ ", fechaCompra=" + fechaCompra + ", fecha=" + fecha + "]";
	}





	private int numero, fila,asiento;
	private double precio;
	private Date fechaCompra;
	private Date fecha;
	
	

}
