package persistance;

import java.util.ArrayList;

import Metier.MetierPOJO.Etape;

import java.sql.*;

public class DAOEtape {
    public boolean isExisteByID(int id_etape) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Etape where Id_etape=?");
            stmt.setInt(1, id_etape);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
	}

    public boolean insertEtape(int id_etape, int num_projet, int duree, Date date_depart, 
        int id_livraison) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into Etape values(?,?,?,?)");
            stmt.setInt(1,id_etape);
            stmt.setInt(4,num_projet);
            stmt.setInt(2,duree);
            stmt.setDate(3,date_depart);
            int i=stmt.executeUpdate(); 
            if(i>0){
                System.out.println(i+" records inserted");  
                con.close();  
                return true; 
            }
            else{
                System.out.println("Error");
                con.close();  
                return false; 
            } 
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deleteEtape(int id_etape) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("delete from Etape where Id_etape=?");  
            stmt.setInt(1,id_etape);  
            int i=stmt.executeUpdate();  
            if(i>0){
                System.out.println(i+" records deleted");  
                con.close();  
                return true; 
            }
            else{
                System.out.println("Error");
                con.close();  
                return false; 
            } 
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean updateEtape(int id_etape, int num_projet, int duree, Date date_depart, 
        int id_livraison) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update Etape set Id_etape=?,Num_projet=?,Duree=?,Date_depart=? where Id_etape=?");  
            stmt.setInt(1,id_etape);
            stmt.setInt(2,num_projet);
            stmt.setInt(3,duree);
            stmt.setDate(4,date_depart);
            
            int i=stmt.executeUpdate();  
            if(i>0){
                System.out.println(i+" records updated");  
                con.close();  
                return true; 
            }
            else{
                System.out.println("Error");
                con.close();  
                return false; 
            }
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public ArrayList<Etape> getAllEtape() {
        ArrayList<Etape> list = new ArrayList<Etape>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from Etape");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Etape e = new Etape(rs.getInt(1), rs.getInt(4), rs.getInt(2), rs.getDate(3), rs.getInt(5));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
