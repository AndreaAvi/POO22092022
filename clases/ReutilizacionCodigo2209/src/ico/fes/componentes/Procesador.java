/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Propósito: Código de clase 15.03.2022. 
Escenario de ejemplo
 */

package ico.fes.componentes;

public class Procesador {

    private String marca;
    private float frecuenciaEnGhz;

    public Procesador() {
    }

    public Procesador(String marca, float frecuenciaEnGhz) {
        this.marca = marca;
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public float getFrecuenciaEnGhz() {
        return frecuenciaEnGhz;
    }

    public void setFrecuenciaEnGhz(float frecuenciaEnGhz) {
        this.frecuenciaEnGhz = frecuenciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", frecuenciaEnGhz=" + frecuenciaEnGhz + '}';
    }
}
