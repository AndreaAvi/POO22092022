/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Director con al menos dos atributos y un método. 
Tarea: Composición
 */
package tareacomposicion.libro.componentes.pelicula;

public class Director {

    private String nombre;
    private int numPremios;

    public Director() {
    }

    public Director(String nombre, int numPremios) {
        this.nombre = nombre;
        this.numPremios = numPremios;
    }

    public int getNumPremios() {
        return numPremios;
    }

    public void setNumPremios(int numPremios) {
        this.numPremios = numPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", numPremios=" + numPremios + '}';
    }

    public void dirigir(String pelicula) {
        System.out.println(this.nombre + " está dirigiendo la película '" + pelicula + "'.");
    }

    public void supervisar(String pelicula) {
        System.out.println(this.nombre + " está supervisando la creación de la película '" + pelicula + "'.");
    }
}
