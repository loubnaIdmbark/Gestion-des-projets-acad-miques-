package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public static Connection ConnectDB(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
             
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projetjava","root","Jwlv8304");   
            return con ;
        }catch(SQLException e ){
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Connexion est echouee avec BD mySQL");
            return null ;
        }
    }
    
}
