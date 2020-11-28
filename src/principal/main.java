
package principal;

import clases.Fruta;
import clases.Gaseosa;
import clases.Producto;
import clases.Shampoo;
import java.util.ArrayList;


public class main {
    
    /* Procedimiento para cargar el listado con los productos especificados en
    el ejercicio */    
    public static void cargarListado(ArrayList<Producto> listado){
        Gaseosa p1 = new Gaseosa(1.5, "Coca-Cola Zero", 20);
        Gaseosa p2 = new Gaseosa(1.5, "Coca-Cola", 18);
        Shampoo p3 = new Shampoo(500, "Shampoo Sedal", 19);
        Fruta p4 = new Fruta("kilo", "Frutillas", 64);
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        listado.add(p4);
    }
    
    /* Procedimiento para mostrar en pantalla el listado de productos utilizando
    el metodo toString sobreescrito */
    public static void mostrarListado(ArrayList<Producto> listado){
        for(int i=0; i<listado.size(); i++){
            System.out.println(listado.get(i).toString());
        }       
    }
    
    /* Procedimiento para encontrar el producto mas caro y el mas barato
    utilizando compareTo sobreescrito, lo realize de modo que obtengo el indice
    del ArrayList del producto mas caro y el mas barato*/
    public static void caroYBarato(ArrayList<Producto> listado){
        int caro, barato;
        caro = barato = 0;
        for(int i=0; i<listado.size(); i++){
            if(listado.get(i).compareTo(listado.get(caro)) > 0){
                caro = i;
            }
            if(listado.get(i).compareTo(listado.get(barato)) < 0){
                barato = i;
            }
        }
        System.out.println("Producto más caro: "+listado.get(caro).getNombre());
        System.out.println("Producto más barato: "+listado.get(barato).getNombre());
    }
    
    public static void main(String[] args) {
        ArrayList<Producto> listado = new ArrayList<>();
        
        cargarListado(listado);
        
        mostrarListado(listado);
        
        System.out.println("=============================");      
               
        caroYBarato(listado);
    }
    
    /* Los procedimientos mostrarListado y caroYBarato reciben como parametro
    un ArrayList de Producto y utilizan bucles "for" basados en el tamaño del
    ArrayList de modo que funcionan independientemente de la cantidad de productos
    y del tipo de productos tambien ya que todos son heredados de la clase Producto*/
}
