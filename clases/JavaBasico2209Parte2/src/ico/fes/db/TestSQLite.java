/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  24/05/2022
Propósito: Código de clase 24/05/2022, 26/05/2022
Prueba de conexión de base de datos con SQLite 
 */
package ico.fes.db;

import java.sql.*;

public class TestSQLite {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            System.out.println(System.getProperty("user.dir") + "/poo2022.db");
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");
            Statement stm = conexion.createStatement();
            //stm.execute("CREATE TABLE prueba1(nombre VARCHAR(10), telefono VARCHAR(15))");
            //stm.execute(" INSERT INTO prueba1 VALUES('Diana','4455677')");
            ResultSet rst = stm.executeQuery("SELECT * FROM prueba1;");
            
            while (rst.next()){
                System.out.println("Nombre: " + rst.getString(1));
                System.out.println("Teléfono: " + rst.getString(2));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
