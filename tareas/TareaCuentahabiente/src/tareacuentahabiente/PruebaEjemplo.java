/*
Autora: Andrea Marcela Cáceres Avitia (Código de tarea POO2209 2022-II)
Fecha de creación:  23/03/2022
última modificación: 25/04/2022
Tarea: Cuentahabiente
Propósito: Se debe crear un arreglo de 5 cuentahabientes con datos de ejemplo
y con un FOR EACH deben mostrar quien es Premium y quien es Regular.
Nota: También se agrega un FOR EACH para probar que el método retirarDinero()
funcione de manera correcta.
 */
package tareacuentahabiente;

public class PruebaEjemplo {

    public static void main(String[] args) {

        //Declaración del arreglo de los cuentahabientes.
        Cuentahabiente[] cuentahabiente = new Cuentahabiente[5];

        //Creación y asignación de estados de cada cuentahabiente.
        cuentahabiente[0] = new Cuentahabiente(54789632, "Enrique Martínez", 25000f);
        cuentahabiente[1] = new Cuentahabiente(47125896, "Valeria González", 127000f);
        cuentahabiente[2] = new Cuentahabiente(44859866, "Tania Hernández", 158900f);
        cuentahabiente[3] = new Cuentahabiente(36352274, "Ernesto Cortés", 33400f);
        cuentahabiente[4] = new Cuentahabiente(15482673, "Fernanda Guerrero", 65000f);

        //Bucle FOR EACH para evaluar el balance de cada cuentahabiente, 
        //mostrando si es premium o regular, así como sus datos.
        System.out.println("--------Pruebas Evaluar Nivel de Cliente--------");
        for (Cuentahabiente cuentahabiente1 : cuentahabiente) {
            System.out.println(cuentahabiente1);
            System.out.println("\t" + cuentahabiente1.evaluarNivelCliente() + "\n");
        }

        //Bucle FOR EACH para probar el método retirarDinero()con cada cuenta.
        System.out.println("----------Pruebas Retirar Dinero----------");
        float montoRetirado = 5000;
        for (Cuentahabiente cuentahabiente1 : cuentahabiente) {
            cuentahabiente1.retirarDinero(montoRetirado);
        }
    }
}
