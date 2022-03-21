/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Editorial con al menos dos atributos y un método. 
Tarea: Composición
 */
package tareacomposicion.componentes.libro;

public class Editorial {

    private String nombre;
    private int anioCreacion;

    public Editorial() {
    }

    public Editorial(String nombre, int anioCreacion) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", anioCreacion=" + anioCreacion + '}';
    }

    public void publicarLibro(String libro) {
        System.out.println("La editorial '" + this.nombre + "' publicó el libro '" + libro + "'.");
    }

    public void corregirLibro() {
        System.out.println("La editorial '" + this.nombre + "' está haciendo correcciones.");
    }
}
