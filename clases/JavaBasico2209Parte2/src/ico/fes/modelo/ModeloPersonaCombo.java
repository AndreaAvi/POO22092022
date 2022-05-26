/*
Profesor: Hernández Cabrera Jesús
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de creación:  19/05/2022
Propósito: Código de clase 19/05/2022, 24/05/2022, 26/05/2022
Interfaces gráficas con swing (∩^o^)⊃━☆
Arquitectura MVC
 */
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class ModeloPersonaCombo implements ComboBoxModel<Persona> {

    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona) o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }

    public void consultarBaseDatos() {
        //Conectar a bd.
        //Consulta SQL.
        PersonaDAO pdao = new PersonaDAO();
        try {
            datos = pdao.obtenerTodo();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void agregarPersona(Persona p) {
      PersonaDAO pdao = new PersonaDAO();
            datos.add(p);
        try {
            pdao.insertar(p);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
