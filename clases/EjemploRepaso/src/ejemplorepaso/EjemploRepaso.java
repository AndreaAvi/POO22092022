/*
Profesor: Hernandez Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  08/03/2022
Propósito: Código de repaso en clase presencial.
 */

package ejemplorepaso;

import java.awt.Color;

public class EjemploRepaso {

    public static void main(String[] args) {

        CubreBocas cubre1 = new CubreBocas();

        cubre1.setColor(Color.BLUE);
        System.out.println(cubre1.getColor());
        System.out.println(cubre1);

        CubreBocas cubreDeAnahi = new CubreBocas(Color.BLACK, "Tela", "KN-Home");
        System.out.println(cubreDeAnahi);

        cubreDeAnahi = new CubreBocas(Color.WHITE, "Tela", "KN95");
        System.out.println(cubreDeAnahi);

    }

}
