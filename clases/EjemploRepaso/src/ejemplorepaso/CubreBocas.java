/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  08/03/2022
Propósito: Código de repaso en clase presencial.
 */

package ejemplorepaso;

import java.awt.Color;

public class CubreBocas {

    private Color color;
    private String material;
    private String modelo;

    public CubreBocas() {
    }

    public CubreBocas(Color color, String material, String modelo) {
        this.color = color;
        this.material = material;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CubreBocas{" + "color=" + color + ", material=" + material
                + ", modelo=" + modelo + '}';
    }

    public void filtrarAire() {
        System.out.println("Filtrando aire");
    }

    public void ajustar() {
        System.out.println("Ajustando cubrebocas" + this.modelo);
    }

}
