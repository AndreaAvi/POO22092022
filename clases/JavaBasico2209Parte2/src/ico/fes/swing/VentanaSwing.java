/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  12/05/2022
Propósito: Código de clase 12/05/2022, 19/05/2022
Interfaces gráficas con swing (∩^o^)⊃━☆
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame {

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;

    public VentanaSwing() throws HeadlessException {

        setTitle("💜 Conversión de °C a °F 💜");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "\\src\\ico\\fes\\swing\\carro.png.png");
        boton = new JButton(icono);
        boton.setBackground(Color.cyan);
        boton.setOpaque(true);
        boton.setToolTipText("Para convertir a grados Fahrenheit");
        resultado = new JLabel("°F");
        lista = new JComboBox();
        texto = new JTextArea(5, 20);
        /*
        lista.addItem("Ingeniería");
        lista.addItem("Derecho");
        lista.addItem("Periodismo");
        lista.addItem("Arquitectura");
         */
        modelo = new ModeloPersonaCombo();
        modelo.consultarBaseDatos();
        lista.setModel(modelo);
        
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        this.validate();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.lista.addItemListener(new ItemAdapter(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Evento..." + e.getItem());
                texto.setText(e.getItem() + "\n");
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
