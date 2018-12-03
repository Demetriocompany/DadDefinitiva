/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidefinitiva;
     
import java.io.File;

/**
 *
 * @author felipe
 */
public class ObjetosComida {

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    String nombre;
    double precio;
    String categoria;
    String alergenos;
    String rutaImagen;
    String Ingredientes;
    int stock;
    ObjetosComida(String nombre,double precio,String categoria,String alergenos,int stock,String Ingredientes){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.alergenos = alergenos;
        this.stock = stock;
        this.Ingredientes = Ingredientes;
    }
}
