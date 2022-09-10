
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Professor;

/**
 *
 * @author Amauri
 */
public class TMProfessor extends AbstractTableModel{
    
    private List<Professor> list;
    
    //private final int COL_ID = 0;
    private final int COL_NAME = 0;
    private final int COL_GENDER = 1;
    private final int COL_AGE = 2;
    private final int COL_CPF = 3;
    
    private final int QUANT_COL = 4;
    
    
    public TMProfessor (List<Professor> ltsProfessor){
        this.list = ltsProfessor;
    }
    
    @Override
    public int getRowCount(){
        return this.list.size();
    }
    
    @Override
    public int getColumnCount(){
        return this.QUANT_COL;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Professor p = this.list.get(rowIndex);
        
        switch (columnIndex) {
            case COL_NAME:
                return p.getName();
                
            case COL_GENDER:
                return p.getGender();
                
            case COL_AGE:
                return p.getAge();

            case COL_CPF:
                return p.getCpf();
                
            default:
                throw new AssertionError();
                
        }
    }
}
