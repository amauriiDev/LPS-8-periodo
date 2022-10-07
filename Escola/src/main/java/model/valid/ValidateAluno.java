/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valid;

import model.Aluno;
import model.exceptions.AlunoException;

/**
 *
 * @author Amauri
 */
public class ValidateAluno {
    
    public Aluno validaCamposEntrada(String name, String gender, String age, String collegeID, String yearOfEntry){
        Aluno aluno = new Aluno();
        if (name.isEmpty())
            throw new AlunoException("Error - Campo vazio: 'nome'.");
        aluno.setName(name);
        
        if (gender.isEmpty()) 
            throw new AlunoException("Error - Campo vazio: 'sexo'.");                
        aluno.setGender(gender.charAt(0));        

        int ageInt = 0;
        if (age.isEmpty())
            throw new AlunoException("Error - Campo vazio: 'idade'.");
        
        if(!age.matches("[0-9]*"))
            throw new AlunoException("Error - Valor inválido no campo 'idade'.");
        
        ageInt = Integer.parseInt(age);
        aluno.setAge(ageInt);        

        if(collegeID.isEmpty())
            throw new AlunoException("Error - Campo vazio: 'matricula'.");
        
        ValidateCollegeID validateID = new ValidateCollegeID();
        if (!validateID.validateID(collegeID))
             throw new AlunoException("Error - Matricula Invalida");
        aluno.setCollegeID(collegeID);
        
        int yearInt = 0;
        if (yearOfEntry.isEmpty())
            throw new AlunoException("Error - Campo vazio: 'anoIngresso'.");
        
        if(!yearOfEntry.matches("[0-9]*"))
            throw new AlunoException("Error - Valor inválido no campo 'anoIngresso'.");
        
        yearInt = Integer.parseInt(yearOfEntry);
        aluno.setYearOfEntry(yearInt);
                
        return aluno;
    }
    
}
