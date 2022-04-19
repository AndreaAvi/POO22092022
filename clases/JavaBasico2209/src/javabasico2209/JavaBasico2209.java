/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/04/2022
Propósito: Código de clase 19.04.2022 
 */
package javabasico2209;

import javax.swing.JOptionPane;

public class JavaBasico2209 {

    public static void main(String[] args) {

        int edad = 20;
        System.out.println("Edad: " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        //Convertir Strings a entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena);//Método miembro o miembro de clase
        altura++;
        System.out.println("Altura: " + altura);

        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura: " + y);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);

        System.out.println("Troncos de un árbol = " + Arbol.tronco);
        System.out.println("Troncos de un árbol = " + tree1.tronco);
        System.out.println("Troncos de un árbol = " + tree2.tronco);
        System.out.println("Troncos de un árbol = " + tree3.tronco);
        System.out.println("Troncos de un árbol = " + tree4.tronco);
        Arbol.generarOxigeno();

        JOptionPane.showMessageDialog(null, "Hola mundo", "Aquí va el título",
                JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", 
                "introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
    }

}
