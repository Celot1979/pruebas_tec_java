package prueba_tec_java.src.Crear_Tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Crear_Tareas {
    public static void main(String[] args) {
        System.out.println("APP PARA GESTIONAR TUS TAREAS");


        int salir = 0;
        while (salir == 0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("MENU:" + "\n" + "1. Crear Tarea" + "\n" + "2. Imprimir tarea" + "\n"+ "3. Eliminar Tarea" + "\n"+  "4.Salir");
            int opciones = teclado.nextInt();

            if (opciones == 1) {
                Scanner Crear_Tarea = new Scanner(System.in);
                System.out.println("\n" + "Ingrese el nombre del tarea: ");
                String nombre = Crear_Tarea.nextLine();
                tareas=new ArrayList<String>();
                tareas.add(nombre);
            } else if (opciones == 2) {
                System.out.println("\n" +"Aquí están todas sus tareas:  ");
                for(String tarea:tareas){
                    System.out.println(tarea);
                }

            } else if (opciones == 3) {
                System.out.println("\n" +"Eliminar Tarea");
                teclado = new Scanner(System.in);
                System.out.println("Ingrese el número de la terea que quiere borrar : ");
                int numero = teclado.nextInt();
                tareas.remove(numero);
            }else if (opciones == 4) {
                System.out.println("Esperamos volver a verle pronto");
                salir = 1;

            }

        }



    }
    static List<String> tareas ;

}
