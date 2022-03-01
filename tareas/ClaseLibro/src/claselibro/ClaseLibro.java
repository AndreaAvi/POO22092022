/*
Autora: Andrea Marcela Cáceres Avitia (Código de tarea POO2209 2022-II)
Fecha de última modificación:  28/02/2022
Propósito: Comprobar que la clase "Libro" se haya creado de manera exitosa junto
con sus atributos y métodos.
 */

package claselibro;


public class ClaseLibro {


    public static void main(String[] args) {
       
    //Creación del objeto
    Libro libro1 = new Libro();
    System.out.println("\nlibro1");

    //Atributos
    System.out.println("\nAtributos");

    libro1.setTitulo("Pedro Pármano");
    System.out.println("Título: " + libro1.getTitulo());
    
    libro1.setAutor("Juan Rulfo");
    System.out.println("Autor: " + libro1.getAutor());

    libro1.setEditorial("RM Verlag, S.L");
    System.out.println("Editorial: " + libro1.getEditorial());

    libro1.setNumPaginas(136);
    System.out.println("Número de páginas: " + libro1.getNumPaginas());

    libro1.setAñoPublicacion(2019);
    System.out.println("Año de publicación: " + libro1.getAñoPublicacion());

    libro1.setImpreso(true);
    if(libro1.isImpreso()){
    System.out.println("El libro es impreso.");
    } else{
    System.out.println("El libro no es impreso.");
    }

    //Métodos
    System.out.println("\nMétodos");

    libro1.abrir();
    libro1.caer();
    libro1.cerrar();

    }
    
}

