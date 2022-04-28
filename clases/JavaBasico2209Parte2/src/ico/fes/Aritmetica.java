/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  28/04/2022
Propósito: Código de clase 28/04/2022_Excepciones.
Clase Aritmética
 */
package ico.fes;

public class Aritmetica {

    private int a;
    private int b;

    public Aritmetica() {
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + '}';
    }

    public int sumar() {
        return (this.a + this.b);
    }

    public int dividir() throws ArithmeticException{
        return (this.a / this.b);
    }
}
