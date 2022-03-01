/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de última modificación:  01/03/2022
Propósito: Creación de la clase Automóvil
 */
package ico.fes;

import java.awt.Color;

public class Automovil {

    private String marca;    //<- Los atributos van en notación lower camel case
    private String subMarca; // Lower camel case: Todas en minúsculas, y a partir de la
    // segunda, todas las primeras letras en mayúsculas
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }
}
