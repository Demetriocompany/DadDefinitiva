/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidefinitiva;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author felipe
 */
public class PruebaBasesdedatos {
    
    
   public static void main(String[] args){
        try{
    // DB connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://35.240.82.235/productos","root","cazador12");
        ArrayList<ObjetosComida> obct = new ArrayList<ObjetosComida>();
       
        byte b[];
        Blob blob;

        PreparedStatement ps=con.prepareStatement("select * from Inventario"); 
        ResultSet rs=ps.executeQuery();
      
         int i = 0;
         while (rs.next()){
        ObjetosComida obc = new ObjetosComida(rs.getString("nombre"),Double.parseDouble(rs.getString("precio")),rs.getString("categoria"),rs.getString("alergenos"),rs.getBlob("imagen"),Integer.parseInt(rs.getString("stock")));     
        obct.add(obc);
     
         i++;
         }
        ps.close();
       
        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }
   }
}
