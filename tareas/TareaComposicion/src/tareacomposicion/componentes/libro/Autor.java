/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Autor con al menos dos atributos y un método. 
Tarea: Composición
 */
package tareacomposicion.componentes.libro;

public class Autor {

    private String nombre;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }

    public void escribir() {
        System.out.println(this.nombre + " está escribiendo.");
    }

    public void pensar() {
        System.out.println(this.nombre + " está pensando.");
    }

}
