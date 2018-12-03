/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidefinitiva;

import static guidefinitiva.Inicio_Sesion.DB_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Gamer
 */
public class Estadisticas {
    
   static final String USER = "root";
   static final String PASS = "cazador12";
    
    public Estadisticas(){
        
        Connection conn = null;
        Statement stmt = null;
        try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(DB_URL,USER,PASS);
          Statement st = conn.createStatement();

          }catch(Exception e){
          //Handle errors for Class.forName
          e.printStackTrace();
        }
        
        // / / / / / / / / / / / / / / / / / / / //
        
        XYSeries series=new XYSeries("Graficote");
        
        int dias=10;
        int[] vectx=new int[dias];
        int[] vecty=new int[dias];
        
        for(int i=0;i<dias;i++){
            series.add(i,i);
        }
        
        XYSeriesCollection dataset=new XYSeriesCollection();
        dataset.addSeries(series);
        
        JFreeChart chart=ChartFactory.createXYLineChart("GRÁFICO DE VENTAS","Tiempo","Ventas",dataset,PlotOrientation.VERTICAL,true,false,false);
        
        ChartFrame frame=new ChartFrame("Ejemplo Gráfica",chart);
        
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
    
}
