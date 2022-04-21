/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/04/2022
Propósito: Código de clase 19.04.2022 y 21.04.2022
-> Con explicaciones de clase 21.04.2022
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
        /*
        System.out.println("Troncos de un árbol = " + tree1.tronco);
        System.out.println("Troncos de un árbol = " + tree2.tronco);
        System.out.println("Troncos de un árbol = " + tree3.tronco);
        System.out.println("Troncos de un árbol = " + tree4.tronco);
         */
        Arbol.generarOxigeno();

        /*
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aquí va el título",
                JOptionPane.ERROR_MESSAGE);

        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", 
                "introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
         */
        //Operador ternario expliación
        //-Sin operador ternario
        int edad3 = 20;
        //validar si es mayor de edad
        String resultado = "";
        if (edad3 < 18) {
            resultado = "Menor de edad";
        } else {
            resultado = "Mayor de edad, ten un tequila para la garganta :)";
        }
        System.out.println(resultado);

        //-Con operador ternario
        //<cond>? <True> : >False>;
        int edad4 = 19;
        String res = "";
        res = edad4 < 18 ? "Menor de edad -edad 4" : "Mayor de edad, tequila";
        System.out.println(res);

        //Versión Mínima
        int edad5 = 19;
        System.out.println(edad5 < 18 ? "Menor de edad 5" : "Ya el tequila");

        //Siguiente
        int val1 = 1;
        int val2 = 2;
        //Haremos una comparación or a nivel de bits es dcer
        /*
        Val1 = 0000...0001;
        val2 = 0000...0010;
        Las dos líneas de arriba es la representación a nivel bits
        Pregunta 1 or 0 ?? cuánto es?
        1!
        
        OR
        1 or 1 = 1
        1 or 0 = 1
        0 or 0 = 0
        
        AND
        1 and 0 = 0
        1 and 1 = 1
        0 and 1 = 0
         */

        System.out.println(val1 | val2);

        /*
        Pasa lo sig.
        val1 = 0000...0001;
        or
        val2 = 000...0010;
        ------------------
                0000...0011 -> 3 en decimal
         */
        System.out.println(val1 & val2);

        //Desplazamientos
        // <<  Desplazamiento a la izquierda
        int val3 = 1; // 000...0001
        int val4 = 0;
        val4 = val3 << 1;
        System.out.println(val4);

        System.out.println("------ARREGLOS------");
        int[] edades;
        edades = new int[5];
        System.out.println(edades);
        edades[0] = 10;
        System.out.println("La primer edad es: " + edades[0]);

        //Para declarar e inicializar en una sola línea
        int pesos[] = {86, 99, 56, 76, 77}; // en kilos
        //Para ver su contenido:
        System.out.println(pesos[0]); //86
        System.out.println(pesos[1]); //99
        System.out.println(pesos[2]); //56
        System.out.println(pesos[3]); //76
        System.out.println(pesos[4]); //77
        //Imprimir lo mismo pero con menos líneas de código
        System.out.println("-----CON FOR-----");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i]);
        }
        
        System.out.println("-----ORDEN INVERSO-----");
        for (int i = (pesos.length - 1); i >= 0; i--) {
            System.out.println(pesos[i]);
        }
        
        
        System.out.println("----Arreglo de alumnos----");
        Alumno[] lista = new Alumno[5]; //5 alumnos
        lista[0] = new Alumno("99999",2,9.0f);
        lista[1] = new Alumno("77777",2,7.0f);
        lista[2] = new Alumno("55555",2,7.0f);
        lista[3] = new Alumno("88888",2,8.0f);
        lista[4] = new Alumno("66666",2,6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println( alumno.evaluarDesempenio());
        }
        
        /*For each es un FOR especial, introducido
        en la versión 2 de java, esa version fue la que 
        sufrió cambios muy grandes en java.
        */
        
        System.out.println("----Con for each----");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }

    }

}
