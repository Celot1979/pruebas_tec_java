package Prueba_Tec_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Prueba_Tec_2_Logica.Ticket;
import Prueba_Tec_2_Logica.cliente;

//2ª Parte 
public class Prueba_tec_2 {

	public static void main(String[] args) {
		List<Ticket>listaTickets = new ArrayList<Ticket>();
		//Creo los tickets
		Ticket ticket1 =new Ticket(12,2,3,1500,new Date(),new Date());
		Ticket ticket2 = new Ticket(13,2,4,1500,new Date(),new Date());
		// creo ticket mediante constructor vacío y aplico ancapsulamiento
		Ticket ticket3=new Ticket();
		ticket3.setNumero(20);
		ticket3.setFecha(new Date());
		ticket3.setFechaCompra(new Date());
		ticket3.setFila(3);
		ticket3.setNumero(14);
		ticket3.setPrecio(1500);
		//Agrego elementos a la lista
		listaTickets.add(ticket1);
		listaTickets.add(ticket2);
		listaTickets.add(ticket3);
		
		//Suma de precios
		double suma =0;
		for(Ticket tick: listaTickets) {
			suma = suma + tick.getPrecio();
		}
		System.out.println("La suma de los tickets son. "+ suma);
		
		//Pedir fila al usuario
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la fila de la que desea ver tickets: ");
		int fila = teclado.nextInt();
		boolean bandera= false;
		for(Ticket tick: listaTickets) {
			if(tick.getFila()== fila) {
				System.out.println(tick.toString());
				bandera=true;
			}	
		}
		
		if(bandera==false) {
			System.out.println("No se ha encontrado datos de la fila en cuestión");
		}
		//4º Creación de clientes ==> tickets
		
		cliente cli1 = new cliente();
		cli1.setId(1);
		cli1.setDni("7188");
		cli1.setNombre("Daniel");
		cli1.setApellido("Gil");
		cli1.getListaTickets().add(ticket1);


	}
	
}
