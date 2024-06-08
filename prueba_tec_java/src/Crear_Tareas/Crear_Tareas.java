package prueba_tec_java.src.Crear_Tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Crear_Tareas {
    public static void main(String[] args) {
        // Create an ArrayList to store the tasks
        ArrayList<String> tasks = new ArrayList<>();

        //Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Show options menu
            System.out.println("\n"+ "MENU:" + "\n" + "\n"+ "1. Create Task" + "\n" + "2. Print assignment" + "\n"+ "3. Delete Task" + "\n"+ "4.Exit");
            System.out.print("\n"+"Option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Clean the scanner buffer

            switch (option) {
                case 1:
                    // Add a task
                    System.out.println("\n"+"Enter a task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("\n"+"Added task.");
                    break;
                case 2:
                    // See all tasks
                    System.out.println("\n"+"The tasks entered are:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    // Delete a task
                    System.out.println("\n"+"Enter the number of the task to delete: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Clear the scanner buffer

                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("\n"+"Task deleted.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    // exit
                    System.out.println("\n"+"Leaving the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }


}
