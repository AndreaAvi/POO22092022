
package ico.fes.composicion;


public class Llanta {

    private String marca;
    private int rodada;

    public Llanta() {
    }

    public Llanta(String marca, int rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "LLanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }
}
