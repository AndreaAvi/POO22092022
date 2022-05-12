/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  03/05/2022
Propósito: Código de clase 03/05/2022, 05/05/2022, 12/05/2022
Interfaces gráficas ( ﾉ ﾟｰﾟ)ﾉ
 */
package javabasico2209parte2;

import ico.fes.awt.Ventana;
import ico.fes.awt.VentanaVersion2;
import ico.fes.swing.VentanaSwing;

public class JavaGraficoMain {
    public static void main(String[] args) {
       // Ventana ventana = new Ventana("Hola AWT ICO FES Aragón");
       //VentanaVersion2 ventana = new VentanaVersion2();
        VentanaSwing vs = new VentanaSwing();
        System.out.println(System.getProperty("user.dir"));
    }
}
