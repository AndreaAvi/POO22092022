/*
Autora: Andrea Marcela Cáceres Avitia (Código de tarea POO2209 2022-II)
Fecha de creación:  23/03/2022
última modificación: 25/04/2022
Tarea: Cuentahabiente
Propósito: Se debe crear una clase Cuentahabiente con los atributos y métodos 
indicados. 
 */
package tareacuentahabiente;

public class Cuentahabiente {

    private int idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente: \n"
                + "\tNombre:" + this.nombre + "\n"
                + "\tId de cliente: " + this.idCliente + "\n"
                + "\tBalance: $" + this.balance;
    }

    public void retirarDinero(float monto) {
        //Código para restarle el monto al balance.
        float balanceFinal = this.balance - monto;

        //Código para imprimir la transacción.
        System.out.println(this.nombre + " realizó un retiro. \n"
                + "\tBalance inicial: $" + this.balance + "\n"
                + "\tMonto retirado: $" + monto + "\n"
                + "\tBalance final: $" + (balanceFinal) + "\n");
        
        //Continuación de código para restarle el monto al balance
        this.balance = balanceFinal;
    }

    public String evaluarNivelCliente() {
        //Código para evaluar el nivel del cliente, y regresar la cadena "Cliente Regular"
        //si su balance es menor o igual a 50000, y "Cliente Premium" si es mayor.
        return this.balance <= 50000f ? "Cliente Regular" : "Cliente Premium";
    }
}
