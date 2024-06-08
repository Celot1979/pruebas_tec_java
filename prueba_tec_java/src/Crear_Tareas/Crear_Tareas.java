package prueba_tec_java.src.Crear_Tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Crear_Tareas {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        System.out.println("APP PARA GESTIONAR TUS TAREAS");
        Scanner scanner = new Scanner(System.in);


        boolean flag = true;
        while (flag = true) {

            /*System.out.println("MENU:" + "\n" + "1. Crear Tarea" + "\n" + "2. Imprimir tarea" + "\n"+ "3. Eliminar Tarea" + "\n"+  "4.Salir");
            int option = keyborard.nextInt();
            keyborard.nextLine();*/
            // Mostrar el menú de opciones
            System.out.println("Seleccione una opción:" + "\n");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Borrar una tarea");
            System.out.println("4. Salir" + "\n");
            System.out.print("Opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (option) {
                case 1:
                    // Agregar una tarea
                    System.out.println("Ingrese una tarea: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Tarea agregada." + "\n" + "\n");
                    break;
                case 2:
                    // Ver todas las tareas
                    System.out.println("\n" + "\n" + "Las tareas ingresadas son:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.println("\n" + "\n");
                    break;
                case 3:
                    // Borrar una tarea
                    System.out.println("\n" + "\n" +"Ingrese el número de la tarea a borrar: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Tarea borrada.");
                    } else {
                        System.out.println("Número de tarea inválido.");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("\n" + "\n" +"Saliendo del programa...");
                    flag= false;
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;


            }


        }

    }
}
