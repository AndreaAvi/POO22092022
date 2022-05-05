/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  05/05/2022
Propósito: Código de clase 05/05/2022
Interfaces gráficas (⌐■_■)
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaVersion2 extends Frame {

    private TextField cuadroTexto;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaVersion2() throws HeadlessException {
        this.setTitle("Ventana con eventos v2");
        this.setSize(300, 220);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        cuadroTexto = new TextField(15);
        this.add(cuadroTexto);
        boton1 = new Button("Presióname");
        this.add(boton1);
        etiqueta = new Label("Texto inicial");
        this.add(etiqueta);

        //Objeto anónimo
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Holi " + cuadroTexto.getText());
                System.out.println("Coordenadas x = " + e.getX());
                System.out.println("Coordenadas y = " + e.getY());
                System.out.println("Botón presionado: " + e.getButton());
            }
        });

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }
            
        });
                
        
        
        this.setVisible(true);
    }
    
   

}
