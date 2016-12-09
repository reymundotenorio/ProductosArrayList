package Principal;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reymundo Tenorio
 */
public class Producto {
    
    private int ID;
    private String Nombre;
    private String Descripcion;
    private int Cantidad;
    private double Costo;

    public Producto() {
    }

    public int getID() {
        return ID;
    }

    public Producto(int ID, String Nombre, String Descripcion, int Cantidad, double Costo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Costo = Costo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
}
