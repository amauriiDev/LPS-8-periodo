package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amauri
 */
public class Persistence {
     private static Connection connection = null;    
    
    private Persistence() {
        try {        
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:dbEscola.sqlite");
        
        } catch (ClassNotFoundException ex) {
            System.err.println("Error - Ao abrir conexão." + ex.toString());            
        } catch (SQLException ex) {            
            System.err.println("Error - Ao abrir conexão." + ex.toString());
        }  
    }    
    
    public static Connection getConnection() {
        if (connection == null) {
            new Persistence();         
        }

        return connection;
    }
       
   
    public static void closeConnection() {
        try {                    
            connection.close();
            connection = null;
        } catch (SQLException ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
