package modelo.tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Usuario;

public class TMClientes extends AbstractTableModel{
    private List<Usuario> lista;

    public TMClientes(List<Usuario> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Usuario ht = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return ht.getNombre();
            case 1:
                return ht.getEstado();
            default:
                return ht.getNivelUsuario();

        }

    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Estado";
            default:
                return "Nivel Usuario";
            
                
        }

    }
}