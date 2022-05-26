/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  26/05/2022
Propósito: Código de clase 26/05/2022
Interfaz DAO Data Access objects para acceso a tablas
 */
package ico.fes.db;

import java.sql.SQLException;
import java.util.ArrayList;

public interface interfazDao {
    
    public abstract ArrayList obtenerTodo() throws SQLException;
    public abstract boolean insertar(Object o) throws SQLException;
    public abstract boolean eliminar(String n) throws SQLException;
}
