
package clases;

/* Clase Gaseosa heredada de la clase Producto */
public class Gaseosa extends Producto {
    
    private double litros;

    public Gaseosa(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    /* Sobreescribo el metodo toString para que muestre los datos en el formato 
    especificado en el ejercicio */
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Litros: "+this.getLitros()+" /// Precio: $"+this.getPrecio();
    }
   
}
