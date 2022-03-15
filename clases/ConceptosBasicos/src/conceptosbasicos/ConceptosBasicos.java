package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;

import ico.fes.Persona;

import ico.fes.Silla;

import java.awt.Color;

public class ConceptosBasicos {

    public static void main(String[] args) {

        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1); // Por defecto se invoca toString()
        System.out.println(s1.toString());

        Automovil miBocho = new Automovil();
        System.out.println(miBocho);
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);

        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);

        Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);

        Persona per1 = new Persona();
        //per1.edad = 200000; <- No se permite por cuestiones de seguridad
        per1.setEdad(22);
        System.out.println(per1);

        Alumno al = new Alumno();
        al.setNombre("José");
        al.setNumeroCuenta("011313313");
        System.out.println(al);

    }

}
