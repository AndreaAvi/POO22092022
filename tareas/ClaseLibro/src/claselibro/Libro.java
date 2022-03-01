/*
Autora: Andrea Marcela Cáceres Avitia (Código de tarea POO2209 2022-II)
Fecha de última modificación:  28/02/2022
Propósito: Crear el objeto "Libro". Deberá contar con mínimo cinco atributos y 
dos métodos.
 */

package claselibro;


public class Libro {

    private String titulo;
    private String autor;
    private String editorial;
    private int numPaginas;
    private int añoPublicacion;
    private boolean impreso;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, int numPaginas, int añoPublicacion, boolean impreso) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.añoPublicacion = añoPublicacion;
        this.impreso = impreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }

    public void abrir() {
        System.out.println("El libro " + this.titulo + " de " + this.autor + " se abrió.");
    }

    public void caer() {
        System.out.println("El libro " + this.titulo + " de " + this.autor + " se cayó.");
    }

    public void cerrar() {
        System.out.println("El libro " + this.titulo + " de " + this.autor + " se cerró.");
    }
}