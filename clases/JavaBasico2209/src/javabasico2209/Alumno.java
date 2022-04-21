/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  21/04/2022
Propósito: Código de clase 21.04.2022 
Clase alumno para explicación de arreglos
 */
package javabasico2209;

public class Alumno {
    
    private String numeroCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, int semestre, float promedio) {
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", semestre=" 
                + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar( int minutos){
        System.out.println("Estudiando ..." + minutos + " minutos.");
    }
    public String evaluarDesempenio(){
        return this.promedio > 8.0f? "Sobresaliente" : "Regular";
    }
    
    
}
