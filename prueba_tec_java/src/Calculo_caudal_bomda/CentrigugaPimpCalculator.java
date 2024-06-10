package prueba_tec_java.src.Calculo_caudal_bomda;
import java.util.Scanner;
public class CentrigugaPimpCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el caudal y la altura de bombeo al usuario
        System.out.print("Ingrese el caudal en metros cúbicos por hora (m^3/h): ");
        double caudal = scanner.nextDouble();

        System.out.print("Ingrese la altura de bombeo en metros (m): ");
        double altura = scanner.nextDouble();

        // Cálculos básicos (en un sistema real se necesitarían más datos)
        double potenciaRequerida = calcularPotencia(caudal, altura);

        // Imprimir los resultados
        System.out.println("Con un caudal de " + caudal + " m^3/h y una altura de " + altura + " m:");
        System.out.println("La potencia requerida para la bomba es: " + potenciaRequerida + " kW");

        scanner.close();
    }
    // * POO Manager Daniel
    // Método para calcular la potencia requerida de la bomba
    public static double calcularPotencia(double caudal, double altura) {
        // Densidad del agua en kg/m^3 (aproximadamente 1000 kg/m^3)
        double densidad = 1000.0;

        // Gravedad en m/s^2
        double gravedad = 9.81;

        // Eficiencia de la bomba (asumiendo un 70% de eficiencia, o 0.70)
        double eficiencia = 0.70;

        // Convertir caudal de m^3/h a m^3/s
        double caudalM3s = caudal / 3600.0;

        // Fórmula de potencia hidráulica: P = (ρ * g * H * Q) / η
        double potenciaHidraulica = (densidad * gravedad * altura * caudalM3s) / eficiencia;

        // Convertir potencia de vatios (W) a kilovatios (kW)
        double potenciaKilovatios = potenciaHidraulica / 1000.0;

        return potenciaKilovatios;
    }
}



