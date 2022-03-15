/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Propósito: Código de clase 15.03.2022. 
Reutilización de código desde la API de Java
 */

package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Procesador;

import javax.swing.JFrame;

public class ReutilizacionCodigo2209 {

    public static void main(String[] args) {

        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());

        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
         */

        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
    }

}
