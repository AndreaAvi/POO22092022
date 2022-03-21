/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Productora con al menos dos atributos y un método. 
Tarea: Composición
 */
package tareacomposicion.componentes.pelicula;

public class Productora {
    
    private String nombre;
    private int anioCreacion;

    public Productora() {
    }

    public Productora(String nombre, int anioCreacion) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", anioCreacion=" + anioCreacion + '}';
    }
    
    public void financiar(String pelicula, int cantDinero){
        System.out.println(this.nombre + " está financiando la película '" + pelicula + "', con $" + cantDinero + ".");
    }
    
    public void distribuir(String pelicula){
        System.out.println(this.nombre + " está distribuyendo la película '" + pelicula + "'.");
    }
}