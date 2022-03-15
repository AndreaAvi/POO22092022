/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Propósito: Código de clase 15.03.2022. 
Escenario de ejemplo
 */

package ico.fes.componentes;

public class Mouse {

    private String marca;
    private String tipo;

    public Mouse() {
    }

    public Mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Mouse{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }
}
