package Lista;

public class LstProductos {
    NodoProducto inicio;

    public LstProductos(){
        inicio = null;
    }
//Agrega un producto al final de la fila
    public void agregarProducto(String nombre, double precio){
        NodoProducto nuevo = new NodoProducto(nombre, precio); //Crea un nuevo producto

        if(inicio == null){ //Revisa el producto
            inicio = nuevo;
        }
        else{
            NodoProducto actual = inicio;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    public void mostrarProductos(){ //Recorre la lista completa y muestra el menú
        if(inicio == null){
            System.out.println("No hay productos disponibles por el momento");
            return;
        }
        NodoProducto actual = inicio;
        while(actual != null){
            System.out.println("Producto: " + actual.nombre);
            System.out.println("Precio: $" + actual.precio);
            System.out.println("");

            actual = actual.siguiente;
        }
    }
}
