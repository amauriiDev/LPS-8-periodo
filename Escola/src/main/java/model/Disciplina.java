package model;

import java.beans.ConstructorProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Amauri
 */

@Data
@AllArgsConstructor
public class Disciplina {
    
    //private Professor professor;
    //private List<Aluno> ltsAlunos;
    
    private int id;
    private String time;    // Aqui seria o horario que será ministrada "2M34" igual do SIGAA
    private String nameProfessor;
    private int qtsAlunos;
}
