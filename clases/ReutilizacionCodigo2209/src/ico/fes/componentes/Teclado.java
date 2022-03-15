/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Propósito: Código de clase 15.03.2022. 
Escenario de ejemplo
 */

package ico.fes.componentes;

public class Teclado {

    private String marca;
    private int numeroTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numeroTeclas) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + '}';
    }
}
