
package pfe;
import java.sql.*;
import java.sql.Connection;
public class Connexion {
    Connection cnx;
    public  Connexion(){
    String urldriver ="com.mysql.jdbc.Driver";
    String urldatabase ="jdbc:mysql://localhost:3306/parc_vehicules";
    //chargement de pilote
    try{
        Class.forName(urldriver);
        System.out.println("Chargement de piloe reussi");
    }
    catch(ClassNotFoundException exp){
        System.out.println("driver not found");
    }
    //connexion a la base
    try{
        cnx = DriverManager.getConnection(urldatabase,"root","");
        System.out.println("Chargement base de donnee reussi");
    }
    catch(SQLException err){
       System.out.println("data base not found"); 
    }
}
   Connection obtenircon (){
      return cnx; 
    } 
}
