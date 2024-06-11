package prueba_tec_java.src.Viernes_13;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */
public class Viernes {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca el año: " + "\n");
        int year = datos.nextInt();
        System.out.println("Introduzca el mes: (Recuende que tiene que ser del 1 al 12 " + "\n");
        int month = datos.nextInt();
        if(month < 1 || month > 12){
            System.out.println("FECHA MAL INTRODUCIDA !!!!" + "\n" + "RECUERDE QUE LOS MESES TIENEN QUE SER DEL 1 AL 12");
            main(args); // Llamada recursiva para volver al inicio del programa
        }
        int day= 13;
        LocalDate fecha = LocalDate.of(year, month, day);
        esViernes13(fecha);
        boolean flag = true;
        if (month >= 1 && month <= 12) {
            if (esViernes13(fecha)) {
                System.out.println("¡Es viernes 13!");
            } else {
                System.out.println("No es viernes 13.");
            }

            }



    }

    public static boolean esViernes13(LocalDate fecha) {
        return fecha.getDayOfWeek() == DayOfWeek.FRIDAY && fecha.getDayOfMonth() == 13;
    }
}
