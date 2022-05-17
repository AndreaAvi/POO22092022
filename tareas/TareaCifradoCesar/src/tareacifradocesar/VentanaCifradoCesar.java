/*
Autora: Andrea Marcela Cáceres Avitia (Código de tarea POO2209 2022-II)
Fecha de creación:  15/05/2022
última modificación: 17/05/2022
Tarea: Cifrado César
Propósito: Crear un proyecto para elaborar una interfaz gráfica con Swing 
que implemente el cifrado césar.
-> Clase para la creación de la ventana.
 */
package tareacifradocesar;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCifradoCesar extends JFrame {

    private JTextField cuadroMensaje;
    private JTextField cuadroDesplazamiento;
    private JTextField cuadroMensajeCif;
    private JButton botonCifrar;
    private JLabel desplazamiento;
    private JLabel mensaje;
    private JLabel mensajeCif;

    public VentanaCifradoCesar() throws HeadlessException {

        //Se definen los aspectos básicos de la ventana.
        setTitle("Cifrado César");
        setSize(500, 700);
        setLayout(new GridLayout(0, 1, 20, 20));

        //-Delaración de objetos-
        //->Para el desplazamiento
        cuadroDesplazamiento = new JTextField(3);
        cuadroDesplazamiento.setToolTipText("Introduzca el número de desplazamiento.");
        desplazamiento = new JLabel("    Tipo de desplazamiento: ");

        //->Para el mensaje original
        cuadroMensaje = new JTextField(20);
        cuadroMensaje.setToolTipText("Introduzca el mensaje que quiere cifrar."
                + " Omita el uso de acentos y caracteres especiales.");
        mensaje = new JLabel("    Ingresa un mensaje: ");

        //->Para el mensaje cifrado
        cuadroMensajeCif = new JTextField(20);
        cuadroMensajeCif.setToolTipText("Aquí aparecerá el mensaje cifrado.");
        mensajeCif = new JLabel("    Mensaje cifrado: ");

        //->Para el botón 
        botonCifrar = new JButton(" Cifrar ");
        botonCifrar.setBackground(Color.pink);

        //-Se agregan los objetos al panel-
        //->Para el desplazamiento
        this.getContentPane().add(desplazamiento);
        this.getContentPane().add(cuadroDesplazamiento);

        //->Para el mensaje original
        this.getContentPane().add(mensaje);
        this.getContentPane().add(cuadroMensaje);

        //->Para el mensaje cifrado
        this.getContentPane().add(mensajeCif);
        this.getContentPane().add(cuadroMensajeCif);

        //->Para el botón 
        this.getContentPane().add(botonCifrar);

        //La ventana se valida y se hace visible.
        this.validate();
        this.setVisible(true);

        //Se implementa que el botón de cerrar detenga el programa.
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //-Implementación de eventos-
        this.botonCifrar.addMouseListener(new MouseAdapter() {

            //Se definen los eventos que ocurren al presionar el botón.
            @Override
            public void mouseClicked(MouseEvent e) {

                //Se declara un arreglo dinámico que contenga todo el abecedario 
                //latino en minúsculas.
                ArrayList<Character> abecedario = new ArrayList<>(
                        Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                                'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
                                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

                String mensajeOriginal;
                String mensajeCifrado = "";
                int llave;
                char letra;
                char letraCifrada;

                try {

                    //Se recuperan los datos de los cuadros de texto.
                    llave = Integer.parseInt(cuadroDesplazamiento.getText());
                    mensajeOriginal = cuadroMensaje.getText();

                    for (int i = 0; i < mensajeOriginal.length(); i++) {

                        //Cada letra se convierte a minúscula, para evaluar si 
                        //esta se encuentra en el abecedario que se declaró.
                        letra = Character.toLowerCase(mensajeOriginal.charAt(i));

                        if (abecedario.contains(letra)) {

                            //Se realiza la conversión usando la fórmula dada en el marco teórico.
                            letraCifrada = abecedario.get((abecedario.indexOf(letra) + (llave)) % 27);

                            //Las letras que originalmente eran mayúsculas regresan a ser mayúsculas.
                            if (Character.toUpperCase(mensajeOriginal.charAt(i)) == mensajeOriginal.charAt(i)) {
                                letraCifrada = Character.toUpperCase(letraCifrada);
                            }

                            //Todas las letras cifradas se concatenan para formar el mensaje cifrado.
                            mensajeCifrado += letraCifrada;

                        } else {
                            //Si el caracter introducido no formaba parte del abecedario,
                            //entonces se concatena sin cifrarse.
                            mensajeCifrado += letra;
                        }
                    }

                    //El mensaje cifrado se imprime en el campo de texto correspondiente.
                    cuadroMensajeCif.setText(mensajeCifrado);

                    //Se manda error si no se introduce un valor numérico en el desplazamiento.
                } catch (NumberFormatException ex1) {
                    JOptionPane.showMessageDialog(
                            null, "Por favor, introduzca un valor numérico", "Error de captura",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
