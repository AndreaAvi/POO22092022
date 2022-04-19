/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/04/2022
Propósito: Código de clase 19.04.2022 
Clase árbol
 */
package javabasico2209;

public class Arbol {

    private float altura;
    private int edad;
    public static final int tronco = 1;

    public Arbol() {
    }

    public Arbol(float altura, int edad) {
        this.altura = altura;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "altura=" + altura + ", edad=" + edad + '}';
    }

    public void crecer(float crecimiento) {
        System.out.println("Altura actual: " + this.altura);
        this.altura += crecimiento;
        System.out.println("Altura posterior: " + this.altura);
    }

    public static void generarOxigeno() {
        System.out.println("Generando oxígeno...");
    }
    
}
