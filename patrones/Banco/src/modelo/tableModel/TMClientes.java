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
        return 5;
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;

    }

}