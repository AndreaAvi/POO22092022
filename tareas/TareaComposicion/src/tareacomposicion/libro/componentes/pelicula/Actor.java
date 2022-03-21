/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Actor con al menos dos atributos y un método. 
Tarea: Composición
 */
package tareacomposicion.libro.componentes.pelicula;

public class Actor {
    
    private String nombre;
    private String medioActuacion;

    public Actor() {
    }

    public Actor(String nombre, String medioActuacion) {
        this.nombre = nombre;
        this.medioActuacion = medioActuacion;
    }

    public String getMedioActuacion() {
        return medioActuacion;
    }

    public void setMedioActuacion(String medioActuacion) {
        this.medioActuacion = medioActuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", medioActuacion=" + medioActuacion + '}';
    }
    
    public void actuar(String pelicula){
        System.out.println(this.nombre + " está actuando en la película '" + pelicula + "'.");
    }
    
    public void improvisar(){
        System.out.println(this.nombre + " está improvisando.");
    }
}
