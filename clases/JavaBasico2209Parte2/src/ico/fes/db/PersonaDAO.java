/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  26/05/2022
Propósito: Código de clase 26/05/2022
 */
package ico.fes.db;

import java.sql.SQLException;
import java.util.ArrayList;
import ico.fes.herencia.Persona;
import java.sql.*;

public class PersonaDAO implements interfazDao {

    public PersonaDAO() {
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        ArrayList<Persona> info = new ArrayList<Persona>();
        try {
            Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM persona;");

            while (rst.next()) {
                info.add(new Persona(rst.getString(1), rst.getInt(2)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return info;
    }

    @Override
    public boolean insertar(Object o) throws SQLException {
        boolean respuesta = false;
        Persona p = (Persona) o;
        String sql = "INSERT INTO persona VALUES(?,?)";
        try {
            PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
            pstm.setString(1, p.getNombre());
            pstm.setInt(2, p.getEdad());
            int rowCount = pstm.executeUpdate();
            respuesta = rowCount == 1 ? true : false;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
    }

    @Override
    public boolean eliminar(String n) throws SQLException {
        return true;
    }

}
