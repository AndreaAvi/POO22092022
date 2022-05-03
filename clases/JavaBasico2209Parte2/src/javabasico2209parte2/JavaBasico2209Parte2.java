/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  28/04/2022
Propósito: Código de clase 28/04/2022_Excepciones.
Y de clase 03/05/2022
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

public class JavaBasico2209Parte2 {

    public static void main(String[] args) {

        // Excepciones
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("----------------------------");
        Scanner teclado = new Scanner(System.in);

        int seleccion = 0;

        String elNombre = "";
        try {
            seleccion = teclado.nextInt();
            elNombre = nombres.get(seleccion);
        } catch (InputMismatchException ie) {
            System.out.println("Debes teclear valores numéricos");
            elNombre = nombres.get(0);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        } catch (Exception e) {
            System.out.println("Excepción genérica");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);
            elNombre = null;
            //Limpieza
        }

        // System.out.println(nombres.get(seleccion));
        System.out.println("Continua el programa...");
        Aritmetica cal = new Aritmetica(2, 0);
        System.out.println(cal.getA() + " + " + cal.getB() + " = " + cal.sumar());

        try {
            System.out.println(cal.getA() + " ÷ " + cal.getB() + " = " + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmética");
        }
        System.out.println("Fin del programa");
        
        System.out.println("----------Comienza interfaces-----------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Área del cuadrado es: " + cuad.calcularArea());
        System.out.println("Área del círculo es: " + circ.calcularArea());
        
        System.out.println("-----------------------");
        EstudianteDeportistaArtista eda = new EstudianteDeportistaArtista();
        eda.setNombre("Diana");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Fútbol");
        eda.setGeneroArtistico("Fotografía, Estampa, Dibujo");
        eda.comer();
        eda.ensayar();
        eda.entrenar();
        System.out.println(eda);

    }

}
