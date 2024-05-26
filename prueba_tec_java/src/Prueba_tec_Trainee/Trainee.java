package Prueba_tec_Trainee;

import java.util.Scanner;

public class Trainee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///** Declaración de variables
		char asientos[][]= new char[10][10];
		boolean bandera= false;
		Scanner teclado = new Scanner(System.in);
		int fila=0,asiento=0;
		String respuesta;
		// PAra que peuda ver el mapa cuando el usuario quiera
		String verMapa;
		
		
		
		
		
		//1º LLenamos el Array bidimensional del estado LIBRE. Así se sabe que no hay ninguna reserva aún.
		for(int f=0;f<10;f++) {
			for(int c=0;c<10;c++) {
				asientos[f][c]='L';
				
			}
			
		}
		//2ºComienza la ejecución del programa por la terminal.
		System.out.println("----- BIENVENIDO AL SISTEMA DE RESERVAS ------");
		while(bandera != true) { // 3ºComienza la lógica del programa. 
			System.out.println("Desea ver los asientos disponibles? : S: Si, cualquier otra letra: NO");
			//**Aquí llamamos al método que dibujará los asientos libres y ocupados
			verMapa=teclado.next();
			if(verMapa.equalsIgnoreCase("S"))dibujarMapa(asientos);
			//RESERVA DE ASIENTOS	
			boolean estaOk=false;
			while(estaOk!=true) {//4º Contemplar si el usuario da valores fuera de la matriz

			System.out.println("\n Ingrese Fila y Columna: ");
			System.out.print("Fila (entre 0 y 0): ");
			fila = teclado.nextInt();
			
			System.out.print("Asiento (entre 0 y 0): ");
			asiento = teclado.nextInt();
			if(fila<=9 && fila >=0) {
				if(asiento<=9 && asiento >=0) {
					System.out.println("Número del asiento no es válido:  ");
				}
				estaOk=true;
			}else {
				System.out.println("Número de fila no es válido:  ");
				estaOk=false;
			}
			}
			
			
			//3º Validar sé la fila o el asiento está libre
			if(asientos[fila][asiento]==('L')) {
				asientos[fila][asiento]='X';
				System.out.println("El asiento fue reservado correctamente ");
				
			}else System.out.println("El asiento está ocupado. Por favor, elija otro  ");
			System.out.println("¿Desea finalizar la reserva? S: Si       Cualquier tecla = NO ");
			respuesta= teclado.next();
			if(respuesta.equalsIgnoreCase("S")) {
				bandera=true;
				
			}
			
			
			}
		
		
		
		

	}
	
	static void dibujarMapa(char asientos[][]) {
		for(int f=0;f<10;f++) {
			//Donde comienza cada fila imprima la fila
			System.out.print(f + "");
			
			for(int c=0;c<10;c++) {
				
				System.out.print("[" + asientos[f][c] + "]");
			}
			System.out.println(" ");
			
		}
	}

	

}
