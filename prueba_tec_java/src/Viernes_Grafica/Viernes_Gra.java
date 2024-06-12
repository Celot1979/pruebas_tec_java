package prueba_tec_java.src.Viernes_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;

import static prueba_tec_java.src.Viernes_13.Viernes.esViernes13;

public class Viernes_Gra {
    public static void main(String[] args){
        // Crear el JFrame principal
        JFrame frame = new JFrame("Ejemplo Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el JPanel principal y establecer el BorderLayout
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        // Crear el JPanel para los dos componentes en horizontal
        JPanel Panel_Ano = new JPanel();
        Panel_Ano.setLayout(new GridLayout(1, 2));

        // Crear los dos componentes en horizontal
        JLabel Etiqueta_Ano = new JLabel("Introducce el año ");
        JTextField Caja_Texto_Ano = new JTextField(10);

        // Agregar los dos componentes al panel horizontal
        Panel_Ano.add(Etiqueta_Ano);
        Panel_Ano.add(Caja_Texto_Ano);

        // Agregar el panel horizontal al panel principal
        panelPrincipal.add(Panel_Ano, BorderLayout.NORTH);

        // Crear el JPanel para los dos componentes debajo en horizontal
        JPanel Panel_Horizontal_Mes = new JPanel();
        Panel_Horizontal_Mes.setLayout(new GridLayout(1, 2));

        // Crear los dos componentes debajo en horizontal
        JLabel Etiqueta_Mes = new JLabel("Introduce el mes");
        JTextField Caja_Texto_Mes = new JTextField(10);

        // Agregar los dos componentes al segundo panel horizontal
        Panel_Horizontal_Mes.add(Etiqueta_Mes);
        Panel_Horizontal_Mes.add(Caja_Texto_Mes);

        // Agregar el segundo panel horizontal al panel principal
        panelPrincipal.add(Panel_Horizontal_Mes, BorderLayout.CENTER);

        // Crear el JPanel para el botón y el JTextArea
        JPanel Panel_Horizontal_Boton = new JPanel();
        Panel_Horizontal_Boton.setLayout(new BorderLayout());

        // Crear el botón
        JButton Boton = new JButton("PRUEBALO !!!!!");
        ActionListener Escucha_Boton = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String Ano = Caja_Texto_Ano.getText();
                String Mes = Caja_Texto_Mes.getText();
                int mes = Integer.parseInt(Mes);
                int dia = 13;
                LocalDate fecha = LocalDate.of(Integer.parseInt(Ano),Integer.parseInt(Mes), dia);
                if (mes >= 1 && mes <= 12) {
                    if (esViernes13(fecha)) {
                        //System.out.println("¡Es viernes 13!");
                        JOptionPane.showMessageDialog(null, "¡Hoy es viernes 13!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Hoy no es viernes 13.");
                    }

                }
            }

            public static boolean esViernes13(LocalDate fecha) {
                return fecha.getDayOfWeek() == DayOfWeek.FRIDAY && fecha.getDayOfMonth() == 13;
            }
        };

        // Agregar el ActionListener al botón
        Boton.addActionListener(Escucha_Boton);
        // Crear el JTextArea
        JTextArea textArea = new JTextArea(5, 20);

        // Agregar el botón y el JTextArea al panel
        Panel_Horizontal_Boton.add(Boton, BorderLayout.NORTH);
        Panel_Horizontal_Boton.add(textArea, BorderLayout.CENTER);

        // Agregar el panel al panel principal
        panelPrincipal.add(Panel_Horizontal_Boton, BorderLayout.SOUTH);

        // Agregar el panel principal al JFrame
        frame.getContentPane().add(panelPrincipal);

        // Ajustar el tamaño del JFrame y hacerlo visible
        frame.pack();
        frame.setVisible(true);
    }
    private  JLabel label1,label2;
    private JTextField textField1, textField2;
    private JButton button1;
}
