package com.lutrinae.escola;

import controller.ProfessorController;
import controller.TMProfessor;
import java.util.ArrayList;
import java.util.List;
import model.Professor;
import view.FrAluno;
import view.FrProfessor;

/**
 *
 * @author Amauri
 */
public class Escola {

    public static void main(String[] args) {
       //FrAluno telaAluno = new FrAluno();
       //telaAluno.setVisible(true);
       
       FrProfessor telaProfessor = new FrProfessor();
       telaProfessor.setVisible(true);
       
       List<Professor> ltsProfessors = new ArrayList<Professor>();
       
       for (int i = 0 ; i < 3 ; i++){
           Professor p = new Professor();
           p.setName("Teste"+i);
           p.setGender('M');
           p.setAge(20+i);
           p.setCpf("000.000.000-0"+i+1);
           ltsProfessors.add(p);
       }
       
       TMProfessor tmProfessor = new TMProfessor(ltsProfessors);
       ProfessorController pController = new ProfessorController(tmProfessor);
       
       
       pController.UpdateTable(telaProfessor.getGrdProfessor(), ltsProfessors);
       
    }
}
