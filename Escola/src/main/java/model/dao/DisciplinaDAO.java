package model.dao;

import factory.Persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Disciplina;

/**
 *
 * @author Amauri
 */
public class DisciplinaDAO implements IDao{
    protected Connection connection;
    private PreparedStatement statement;
    
    public DisciplinaDAO(){
    }

    @Override
    public void save(Object obj) {
        Disciplina disciplina = (Disciplina) obj;
        
        String sql = " INSERT INTO "
                + " disciplina(time, nameProfessor, qtsAlunos) "
                + " VALUES(?,?,?) ";
        
        try {
            connection = Persistence.getConnection();
            statement = connection.prepareStatement(sql);
            
            //preencher cada ? com o campo adequado
            statement.setString(1, disciplina.getTime());
            statement.setString(2, disciplina.getNameProfessor());
            statement.setInt(3, disciplina.getQtsAlunos());
         
            statement.execute();
            statement.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally{
            Persistence.closeConnection();            
        }   


    }

    @Override
    public boolean delete(Object obj) {
        Disciplina disciplina = (Disciplina) obj;
        
        String sql = " DELETE FROM disciplina WHERE id = ? ";
        try {
            connection = Persistence.getConnection();
            statement = connection.prepareStatement(sql);
            
            //preenche a condição
            statement.setLong(1, disciplina.getId());
            
            statement.execute();
            statement.close();
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }finally{
            Persistence.closeConnection();
        }

    }

    @Override
    public Object find(Object obj) {
        Disciplina disciplina = (Disciplina) obj;
        
        String sql = " SELECT * FROM disciplina WHERE id = ? ";
        try {
            
            statement = Persistence.getConnection().prepareStatement(sql);
            
            statement.setInt(1, disciplina.getId());
            
            ResultSet resultset = statement.executeQuery();
            
            Disciplina d = null;
            while (resultset.next()) {
                d = new Disciplina(
                        resultset.getInt(1),
                        resultset.getString(2),
                        resultset.getString(3),
                        resultset.getInt(4));               
            }
            statement.close();
            return d;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }finally{
            Persistence.closeConnection();
            //connection.close();
        }  

    }

    @Override
    public List<Object> findAll() {
        List<Object> list = new ArrayList<>();

        String sql = " SELECT * FROM disciplina ORDER BY upper(nameProfessor) ";
        try {            
            statement = Persistence.getConnection().prepareStatement(sql);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                Disciplina disciplina = new Disciplina(
                        resultset.getInt(1),
                        resultset.getString(2),
                        resultset.getString(3),
                        resultset.getInt(4));

                list.add(disciplina);
            }
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }finally{
            Persistence.closeConnection();            
        }  

        return list;

    }
    
     public void update(Object obj) {
        Disciplina disciplina = (Disciplina) obj;

        String sql = " UPDATE disciplina "
                + " SET time=?, nameProfessor=?, qtsAlunos=? "
                + " WHERE id = ?";
        try {
            connection = Persistence.getConnection();
            statement = connection.prepareStatement(sql);
            
            //preencher cada ? com o campo adequado
            statement.setString(1, disciplina.getTime());
            statement.setString(2, disciplina.getNameProfessor());
            statement.setInt(3, disciplina.getQtsAlunos());
            
            //preenche a condição do WHERE
            statement.setInt(6, disciplina.getId());
            
            statement.execute();
            statement.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }   finally{
            Persistence.closeConnection();           
        }    
    }

}
