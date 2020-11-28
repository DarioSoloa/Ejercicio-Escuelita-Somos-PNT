
package clases;

//Clase Producto implementando Comparable
public class Producto implements Comparable<Producto> {
    
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /* Sobreescribo el metodo compareTo para utilizar como criterio de
    comparación solo los precios de los productos */
    @Override
    public int compareTo(Producto o) {
        int r=0;
        if(this.precio < o.precio){
            r=-1;
        }else if(this.precio > o.precio){
            r=1;
        }else{
            r=0;
        }
        return r;
    }
    
}
