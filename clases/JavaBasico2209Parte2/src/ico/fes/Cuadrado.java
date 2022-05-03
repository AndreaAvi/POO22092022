/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  28/04/2022
Propósito: Código de clase 28/04/2022_Excepciones.
y de clase 03/05/2022
Interfaces \^o^/ Clase Cuadrado
 */
package ico.fes;

public class Cuadrado implements Figura {

    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    @Override
    public float calcularArea() {
        System.out.println("Multiplicando lado por lado");
        return (this.lado*this.lado);
    }
    
}
