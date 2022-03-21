/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Pelicula, compuesta de las clases Director, Actor y Productora. 
Tarea: Composición
 */
package tareacomposicion.libro.pelicula;

import tareacomposicion.libro.componentes.pelicula.Actor;
import tareacomposicion.libro.componentes.pelicula.Director;
import tareacomposicion.libro.componentes.pelicula.Productora;

public class Pelicula {

    private String titulo;
    private int anioEstreno;
    private Director director;
    private Actor actor;
    private Productora companiaProductora;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anioEstreno, Director director, Actor actor, Productora companiaProductora) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.actor = actor;
        this.companiaProductora = companiaProductora;
    }

    public Productora getCompaniaProductora() {
        return companiaProductora;
    }

    public void setCompaniaProductora(Productora companiaProductora) {
        this.companiaProductora = companiaProductora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        // return "Pelicula{" + "titulo=" + titulo + ", anioEstreno=" + anioEstreno + ", director=" + director + ", actor=" + actor + ", compa\u00f1iaProductora=" + companiaProductora + '}';
        String estado = "\nPelícula \n ";
        estado += "Título: " + this.titulo + " \n ";
        estado += "Año de Estreno: " + this.anioEstreno + " \n ";
        estado += "Director: " + this.director.getNombre() + " \n ";
        estado += "No. de premios del director: " + this.director.getNumPremios() + " \n ";
        estado += "Actor/actriz: " + this.actor.getNombre() + " \n ";
        estado += "Medio de actuación del actor: " + this.actor.getMedioActuacion() + " \n ";
        estado += "Compañía productora: " + this.companiaProductora.getNombre() + " \n ";
        estado += "Año de fundación de la compañía productora: " + this.companiaProductora.getAnioCreacion() + " \n ";

        return estado;
    }

    public void conmover() {
        System.out.println("La película '" + this.titulo + "' conmovió a la audiencia.");
    }

    public void entretener() {
        System.out.println("La película '" + this.titulo + "' entretuvo a la audiencia.");
    }

}