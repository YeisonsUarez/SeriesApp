package co.edu.unab.Hernandez.Yeison.seriesapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Series implements Serializable {
    private String nombre, descripcion, imagedetalle,imagepreview;
    private ArrayList elenco;

    public String getImagepreview() {
        return imagepreview;
    }

    public void setImagepreview(String imagepreview) {
        this.imagepreview = imagepreview;
    }

    public ArrayList getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList elenco) {
        this.elenco = elenco;
    }

    public Series(String nombre, String descripcion, String imagedetalle, String imagepreview, ArrayList elenco) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagedetalle = imagedetalle;
        this.imagepreview = imagepreview;
        this.elenco = elenco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagedetalle() {
        return imagedetalle;
    }

    public void setImagedetalle(String imagedetalle) {
        this.imagedetalle = imagedetalle;
    }
}
