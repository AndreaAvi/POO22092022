/*
POO2209  Semestre 2022-2
Clase 24.02.2022
 */
package ico.fes;

/**
 *
 * @author Andi
 */
public class Foco {

    private String color;
    private String tipo;
    private int tanano;

    public Foco() {
    }

    public Foco(String color, String tipo, int tanano) {
        this.color = color;
        this.tipo = tipo;
        this.tanano = tanano;
    }

    public int getTanano() {
        return tanano;
    }

    public void setTanano(int tanano) {
        this.tanano = tanano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tamano=" + tanano + '}';
    }
}
