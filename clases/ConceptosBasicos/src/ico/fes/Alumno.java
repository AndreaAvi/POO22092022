package ico.fes;

public class Alumno extends Persona { //Hereda atributos y métodos de la clase Persona

    private String numeroCuenta;
    private String carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera, int grupo) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta
                + ", carrera=" + carrera + ", grupo=" + grupo + '}';
    }
}
