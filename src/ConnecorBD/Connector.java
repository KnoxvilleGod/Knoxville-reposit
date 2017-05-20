package ConnecorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 18.05.2017.
 */
public class Connector {
    private static final String userName = "root";
    private static final String password = "root";
    private static final String URL ="jdbc:mysql://localhost:3306/mydbtest ";
    private Connection connection;

    public Connection getConnection(){
        return connection;

    }
    public void closeConnection() throws SQLException {
        connection.close();
        if (connection.isClosed()){
            System.out.println("Отключились от Бд!");
        }
    }
    public void openConnection()  {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL,userName,password);
            if(!connection.isClosed()){
                System.out.println("Подключились к БД!!!!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

