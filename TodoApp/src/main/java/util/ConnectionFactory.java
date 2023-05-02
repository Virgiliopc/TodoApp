package util;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author virgi
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conex�o com o bando de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (Exception ex){
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados");
        }
    }
}
