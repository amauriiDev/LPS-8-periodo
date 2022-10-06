/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Aluno;

/**
 *
 * @author Amauri
 */
public class TMAluno extends AbstractTableModel {

    private List<Aluno> lista;
    
    private final int COL_NAME = 0;   
    private final int COL_GENDER = 1;    
    private final int COL_AGE = 2;
    private final int COL_COLLEGEID = 3;
    private final int COL_YEAROFENTRY = 4; 
    
    private final int QUANT_COL = 5;

    public TMAluno(List<Aluno> lstAlunos) {        
        lista = lstAlunos;  
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return QUANT_COL;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {               
        Aluno aux = new Aluno();
        if (lista.isEmpty()) {
            return aux;
        } else {
            aux = (Aluno) lista.get(rowIndex);

            //verifica qual valor deve ser retornado
            switch (columnIndex) {
                case -1:
                    return aux;
                case COL_NAME:
                    return aux.getName();
                case COL_GENDER:
                    return aux.getGender();
                 case COL_AGE:
                    return aux.getAge();
                case COL_COLLEGEID:
                    return aux.getCollegeID();
                case COL_YEAROFENTRY:
                    return aux.getYearOfEntry();
               
                default: 
                    break;
            }
        }
        return aux;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        
        switch (column) {
            case COL_NAME:
                return "Nome";
            case COL_GENDER:
                return "Sexo";
            case COL_AGE:
                return "Idade";
            case COL_COLLEGEID:
                return "Matricula";
            case COL_YEAROFENTRY:
                return "Ano de Ingresso"; 
            
            default:
                break;
        }

        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
//        if(columnIndex == COL_MATRICULA)
//            return Boolean.class;
        
        return String.class;
    }

}
