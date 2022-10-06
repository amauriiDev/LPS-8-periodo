/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.Aluno;
import valid.ValidateAluno;

/**
 *
 * @author Amauri
 */
public class AlunoController {
     private TMAluno tmAluno;
    
    
    public AlunoController(TMAluno tmAluno){
        this.tmAluno = tmAluno;
    }
    
    public AlunoController(){
       // implementar DAO
    }
    
    public void updateAluno(int idAluno, String name, String gender, String age, String collegeID, String yearOfEntry) {
        ValidateAluno valid = new ValidateAluno();
        Aluno novoAluno = valid.validaCamposEntrada(name, gender, age, collegeID, yearOfEntry);
        novoAluno.setId(idAluno);
        
        // ainda nao implementado
        //repositorio.update(novoAluno);
    }
    public void registerAluno(String name, String gender, String age, String collegeID, String yearOfEntry) {
        ValidateAluno valid = new ValidateAluno();
        Aluno novoAluno = valid.validaCamposEntrada(name, gender, age, collegeID, yearOfEntry);

        /* TODO: IMPLEMENTAR
        if (repositorio.findByMatricula(matricula) == null) {
            repositorio.save(novoAluno);
        } else {
          */
    }


    
    
    public void UpdateTable(JTable grdAluno, List<Aluno> ltsAluno){
        tmAluno = new TMAluno(ltsAluno);
        grdAluno.setModel(tmAluno);
        
    }
    
    
    //TODO: Remover método
    public void UpdateTable(JTable grd) {
        List<Aluno> lst =  new ArrayList<Aluno>();//repositorio.findAll();
        
        TMAluno tmAluno = new TMAluno(lst);
        grd.setModel(tmAluno);        
    }

}
