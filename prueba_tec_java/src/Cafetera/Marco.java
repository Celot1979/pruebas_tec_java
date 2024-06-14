package prueba_tec_java.src.Cafetera;

import javax.swing.*;

public class Marco extends JFrame {
    public Marco() {
        setTitle("Marco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        JLabel lblNewLabel = new JLabel("Marco");
        panel.setVisible(true);
    }
}
