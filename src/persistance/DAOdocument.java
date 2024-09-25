package persistance;

import java.util.ArrayList;

import Metier.MetierPOJO.document;

import java.sql.*;

public class DAOdocument {
    public boolean isDocumentExist(int id) {
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from document where id=?");
            stmt.setInt(1, id);
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
    
    public boolean insertDocument(int id_document,int id_etape, Date date_depot,String text) {
        try{ 
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("insert into document values(?,?,?,?)");
            stmt.setInt(1,id_document);
            stmt.setInt(2,id_etape);
            stmt.setDate(3,date_depot);
            stmt.setString(4,text);
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

    public boolean deleteDocument(int id_document) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("delete from document where id_document=?");  
            stmt.setInt(1,id_document);  
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

    public boolean updateDocument(int id_document,int id_etape, Date date_depot,String text) {
        try{  
            Connection con=Connexion.ConnectDB();
            PreparedStatement stmt=con.prepareStatement("update document set etape_id=?,date_depot=?,fichier=? where id_document=?");  
            stmt.setInt(1,id_etape);
            stmt.setDate(2,date_depot);
            stmt.setString(3,text);
            stmt.setInt(4,id_document);
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

    public ArrayList<document> getAllDocuments() {
        ArrayList<document> list = new ArrayList<document>();
        try {
            Connection con = Connexion.ConnectDB();
            PreparedStatement stmt = con.prepareStatement("select * from document");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                document e = new document(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getString(4));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}

