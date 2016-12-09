package Principal;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reymundo Tenorio
 */
public class ManagmentProducto {
    
   private  ArrayList<Producto> Productos = new ArrayList<Producto>();

    public ManagmentProducto() {
    }

   public ManagmentProducto(ArrayList<Producto> Productos) {
       this.Productos=Productos;
    } 

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }
    
    public void Agregar(Producto p){
        this.Productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }
    
    
    public void Eliminar(int id){
        
       this.Productos.remove(id);
        
        
    }
    
    public int Tamano(){
       int size;
       size = this.Productos.size();
       return size;
    }
    
    
//    public void MostrarTodos(){
//           if (Productos!= null) {
//            for (Producto opc : Productos) {
//                
//                
////                System.out.println("---------------");
////                System.out.println(opc.getCedula());
////                System.out.println(opc.getNombres());
////                System.out.println(opc.getEmail());
//                }
//            }
//        else {
//               
//             //  JOptionPane.showMessageDialog(, "No Hay Registros","Error",JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
}
