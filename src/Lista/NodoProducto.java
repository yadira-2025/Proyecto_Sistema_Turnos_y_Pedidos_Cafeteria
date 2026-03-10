package Lista;

//Guarda la información del producto
public class NodoProducto { //Son atributos del nodo, y cada uno guarda digerentes cosas
    String nombre; //Guarda el nombre del producto
    double precio; //Guarda el precio del producto
    NodoProducto siguiente; //Este es la referencia al siguiente nodo

    public NodoProducto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.siguiente = null;
    }
    
}