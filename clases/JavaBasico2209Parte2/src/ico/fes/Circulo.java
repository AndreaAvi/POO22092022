/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  03/05/2022
Propósito: Código de clase 03/05/2022
Interfaces \^o^/ Clase Círculo
 */
package ico.fes;

//Java Bean, POJO es diferente a alos EJB Enterprise Java Beans
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }
    
    /*
    Principio de diseño de L. P: 0, 1 e infinito: Sólo los valores 0, 1 e 
    infinitos son válidos para usarse en la codificación de algoritmos. El 
    lenguaje de programación debe proporcionar un mecanismo para evitar usar 
    literales numéricas en el programa.
    */
    
}
