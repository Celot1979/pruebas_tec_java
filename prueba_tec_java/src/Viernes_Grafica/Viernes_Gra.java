package prueba_tec_java.src.Viernes_Grafica;

import javax.swing.*;

public class Viernes_Gra {
    public static void main(String[] args){
        // Crear una ventana
        // Crear una ventana
        JFrame ventana = new JFrame("Interfaz Fecha");
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();
        // Crear los componentes
        JLabel label1 = new JLabel("Año:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Mes:");
        JTextField textField2 = new JTextField(10);
        JButton button1 = new JButton("Resultado");
        // Agregar los componentes al panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button1);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
