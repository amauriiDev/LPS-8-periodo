
package controller;

import java.util.List;
import javax.swing.JTable;
import model.Professor;

/**
 *
 * @author Amauri
 */
public class ProfessorController {
    private TMProfessor tmProfessor;
    
    
    public ProfessorController(TMProfessor tmProfessor){
        this.tmProfessor = tmProfessor;
    }
    
    
    public void UpdateTable(JTable grdProfessor, List<Professor> ltsProfessor){
        tmProfessor = new TMProfessor(ltsProfessor);
        grdProfessor.setModel(tmProfessor);
        
    }
    
}
