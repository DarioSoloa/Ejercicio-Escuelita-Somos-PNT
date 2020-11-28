
package clases;

/* Clase Gaseosa heredada de la clase Producto */
public class Fruta extends Producto {
    
    private String unidadVenta;

    public Fruta(String unidadVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }
    
    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    /*Sobreescribo el metodo toString para que muestre los datos en el formato 
    especificado en el ejercicio*/
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Precio: $"+this.getPrecio()+" /// Unidad de venta: "+this.getUnidadVenta();
    }
    
}
