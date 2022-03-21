/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/03/2022
Propósito: Crear la clase Libro, compuesta de las clases Autor y Editorial. 
Tarea: Composición
 */
package tareacomposicion.libro;

import tareacomposicion.componentes.libro.Autor;
import tareacomposicion.componentes.libro.Editorial;

public class Libro {

    private String titulo;
    private int numPaginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, int numPaginas, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {

        String estado = "\nLibro \n ";
        estado += "Título: " + this.titulo + " \n ";
        estado += "Número de Páginas: " + this.numPaginas + " \n ";
        estado += "Autor: " + this.autor.getNombre() + " \n ";
        estado += "Nacionalidad del Autor: " + this.autor.getNacionalidad() + " \n ";
        estado += "Editorial: " + this.editorial.getNombre() + " \n ";
        estado += "Año de creación de editorial: " + this.editorial.getAnioCreacion() + " \n ";

        return estado;
    }

    public void abrir() {
        System.out.println("El libro '" + this.titulo + "' se abrió.");
    }

    public void cerrar() {
        System.out.println("El libro '" + this.titulo + "' se cerró.");
    }

}
