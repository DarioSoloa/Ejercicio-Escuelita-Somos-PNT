
package clases;

/* Clase Gaseosa heredada de la clase Producto */
public class Shampoo extends Producto {
    
    private int contenido;

    public Shampoo(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }
    
    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    /* Sobreescribo el metodo toString para que muestre los datos en el formato 
    especificado en el ejercicio */
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Contenido: "+this.getContenido()+"ml /// Precio: $"+this.getPrecio();
    }
    
}
