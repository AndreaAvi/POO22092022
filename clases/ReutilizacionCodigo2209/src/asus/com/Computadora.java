/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Propósito: Código de clase 15.03.2022. 
Escenario de ejemplo: Implementando composición.
 */
package asus.com;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

public class Computadora {

    private String marca;
    private String modelo;
    private Monitor pantalla; //<- Implementación de la composición del monitor en la computadora.
    private Mouse raton;      //<- Implementación de la composición del ratón en la computadora.
    private Teclado teclado;  //<- Implementación de la composición del teclado en la computadora.
    private Procesador cpu;   //<- Implementación de la composición del procesador en la computadora.

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo
                + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado="
                + teclado + ", cpu=" + cpu.toString() + '}';
    }

}
