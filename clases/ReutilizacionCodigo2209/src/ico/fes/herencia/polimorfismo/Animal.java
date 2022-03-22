/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  22/03/2022
Propósito: Código de clase 22.03.2022. 
Ejemplo de Herencia y Polimorfismo
 */
package ico.fes.herencia.polimorfismo;


public class Animal {
    
    private int numeroPatas;

    public Animal() {
    }

    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + '}';
    }
    
    public void emitirSonido(){
        System.out.println("Emitiendo sonido.");
    }
    
}
