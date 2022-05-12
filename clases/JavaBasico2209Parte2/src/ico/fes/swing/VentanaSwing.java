/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  12/05/2022
Propósito: Código de clase 12/05/2022
Interfaces gráficas con swing (∩^o^)⊃━☆
 */
package ico.fes.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;

    public VentanaSwing() throws HeadlessException {
        setTitle("💜 Conversión de °C a °F 💜");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\carro.png.png");
        
        boton = new JButton(icono);
        resultado = new JLabel("°F");
        boton.setBackground(Color.cyan);
        boton.setOpaque(true);
        boton.setToolTipText("Para convertir a grados Fahrenheit");
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFahrenheit = 0.0f;
                float gradosCelsius = 0.0f;
                try {
                    gradosCelsius = Float.parseFloat(cuadro.getText());
                    gradosFahrenheit = (gradosCelsius * (9.0f / 5.0f)) + 32.0f;
                    resultado.setText(gradosFahrenheit + " °F");
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(
                            null, "Introduce un valor numérico", "Error de captura",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
