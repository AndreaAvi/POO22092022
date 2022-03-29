/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  29/03/2022
Propósito: Código de clase 29.03.2022
Pruebas de polimorfismo
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

public class PruebasPolimorfismo {

    public static void main(String[] args) {

        System.out.println("Hola polimorfismo");

        Persona per1 = new Persona();
        per1.setNombre("José");
        per1.dormir();
        Alumno al1 = new Alumno();
        al1.setNombre("José");
        al1.dormir();//<-Polimorfismo por sobre escritura (volver a definir un método en la super clase)
        al1.dormir(4);//<-Polimorfismo por sobrecarga (hacer que un método recibe diferentes argumentos que a sivez modificarán el comportamiento del método)
        

    }
}
