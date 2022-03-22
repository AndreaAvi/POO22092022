/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  22/03/2022
Propósito: Código de clase 22.03.2022. 
Ejemplo de Herencia y Polimorfismo
 */
package ico.fes.herencia.polimorfismo;

public class Perro extends Animal {

    private String raza;
    private String pedigree;

    public Perro() {
    }

    public Perro(String raza, String pedigree) {
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public Perro(String raza, String pedigree, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
        this.pedigree = pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", pedigree=" + pedigree + '}';
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro está ladrando... Guau!! Guau!!");
    }

}
