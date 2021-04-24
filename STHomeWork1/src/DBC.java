import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DBC {
    private static String diverClass;    
    private static String url;   
    private static String user;  
    private static String password;  
 
    static {
        ResourceBundle rb=ResourceBundle.getBundle("dbinfo");    
        diverClass=rb.getString("com.mysql.jdbc.Drive");
        url=rb.getString("jdbc:mysql://localhost:8806/db_examsystem");
        user=rb.getString("zzy");
        password=rb.getString("root");
        try {
            Class.forName(diverClass);  
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 得到资源的方法
     * @return 资源
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    }