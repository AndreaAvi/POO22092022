/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  15/03/2022
Fecha de última modificación:  22/03/2022
Propósito: Código de clase 15.03.2022. 
Reutilización de código desde la API de Java
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

public class ReutilizacionCodigo2209 {

    public static void main(String[] args) {

        String nombre = new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());

        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
         */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);

        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);

        //Ejercicio: Establecer un mouse de marca Logitech del tipo óptico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);

        Computadora compu2 = new Computadora("Apple", "MacBook Pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "Óptico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));

        System.out.println(compu2);

        //Ejercicio: Cambar marca mouse a apple y tipo touch
        //compu2.setRaton(new Mouse("Apple", "Touch")); //<- Solución 1
        compu2.getRaton().setMarca("Apple");            //<- Solución 2
        compu2.getRaton().setTipo("Touch");

        System.out.println(compu2);

        System.out.println("-----------------------------------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);

        Alumno alu2 = new Alumno("12345678", "ICO", "José Pérez", 19);
        System.out.println(alu2);
        
        
        alu1.setNumeroCuenta("23232323");
        alu1.setEdad(19);
        System.out.println(alu1);
        
        
        System.out.println("---------------Composición y Herencia en la misma clase-----------------");
        Servidor server = new Servidor();
        System.out.println(server);
        
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        
        server.setMarca("HP");
        System.out.println( server );
        
        server.setRaton( new Mouse("LG", "Óptico"));
        System.out.println(server);
        
        server.getRaton().setMarca("Logitech");
         System.out.println(server);
         
         System.out.println("----------Ejemplo polimorfismo-----------");
         
         Perro dog = new Perro("Bull dog", "5 estrellas", 4);
         Animal animal1 = new Animal(4);
         dog.emitirSonido();
         animal1.emitirSonido();
         
    }

}
