/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  03/05/2022
Propósito: Código de clase 03/05/2022
Último cambio: 19/05/2022-> Se modificó el To String
Interfaces \^o^/ 
 */
package ico.fes.herencia;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return   nombre + ", " + edad ;
    }
    
    public void comer(){
        System.out.println(this.nombre + " está comiendo...");
    }
}
