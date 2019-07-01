package modelo.tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Cliente;

public class TMClientes extends AbstractTableModel{
    private List<Cliente> lista;

    public TMClientes(List<Cliente> lista) {
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
       Cliente ht = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return ht.getRut();
            case 1:
                 return ht.getNombre();
            case 2:
                return ht.getApellido();
            case 3:
                return ht.getSueldoLiquido();
               
            default:
                return ht.getEstado();

        }

    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Rut";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
            case 3:
                return "Sueldo";
            default:
                return "Estado";
            
                
        }

    }
}