package ecommerce;

/**
 *
 * @author Aluno 17
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/loja","root","admin");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
