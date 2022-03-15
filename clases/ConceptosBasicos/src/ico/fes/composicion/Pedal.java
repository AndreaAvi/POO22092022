
package ico.fes.composicion;


public class Pedal {

    private String marca;
    private String material;

    public Pedal() {
    }

    public Pedal(String marca, String material) {
        this.marca = marca;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Pedal{" + "marca=" + marca + ", material=" + material + '}';
    }
}
