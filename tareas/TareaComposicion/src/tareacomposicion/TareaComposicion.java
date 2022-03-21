/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Probar las clases compuestas Libro y Película.
Tarea: Composición
 */
package tareacomposicion;

import tareacomposicion.componentes.libro.Autor;
import tareacomposicion.componentes.libro.Editorial;
import tareacomposicion.libro.Libro;
import tareacomposicion.componentes.pelicula.Actor;
import tareacomposicion.componentes.pelicula.Director;
import tareacomposicion.componentes.pelicula.Productora;
import tareacomposicion.pelicula.Pelicula;

public class TareaComposicion {

    public static void main(String[] args) {

        Libro libro1 = new Libro();

        libro1.setTitulo("Las Uvas de la Ira");
        libro1.setNumPaginas(620);
        libro1.setAutor(new Autor("John Steinbeck", "Estadounidense"));
        libro1.setEditorial(new Editorial("Grupo Editorial Tomo", 1994));

        System.out.println(libro1);

        System.out.println("Pruebas de Métodos de Uso General");

        System.out.println("\nLibro:");
        libro1.abrir();
        libro1.cerrar();

        System.out.println("\nAutor:");
        libro1.getAutor().escribir();
        libro1.getAutor().pensar();

        System.out.println("\nEditorial:");
        libro1.getEditorial().publicarLibro(libro1.getTitulo());
        libro1.getEditorial().corregirLibro();
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Pelicula pelicula1 = new Pelicula();
        
        pelicula1.setTitulo("Last Night in Soho");
        pelicula1.setAnioEstreno(2021);
        pelicula1.setDirector(new Director("Edgar Wright", 5));
        pelicula1.setActor(new Actor("Anya Taylor Joy", "Cine y televisión"));
        pelicula1.setCompaniaProductora(new Productora("Focus Features", 2002));
        
        System.out.println(pelicula1);
        
        System.out.println("Pruebas de Métodos de Uso General");

        System.out.println("\nPelícula:");
        pelicula1.conmover();
        pelicula1.entretener();

        System.out.println("\nDirector:");
        pelicula1.getDirector().dirigir(pelicula1.getTitulo());
        pelicula1.getDirector().supervisar(pelicula1.getTitulo());

        System.out.println("\nActor:");
        pelicula1.getActor().actuar(pelicula1.getTitulo());
        pelicula1.getActor().improvisar();
        
        System.out.println("\nCompañía Productora:");
        pelicula1.getCompaniaProductora().distribuir(pelicula1.getTitulo());
        pelicula1.getCompaniaProductora().financiar(pelicula1.getTitulo(), 43000000);
    }

}
