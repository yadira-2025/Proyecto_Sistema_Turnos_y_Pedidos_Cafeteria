package Pila;
public class pilapedidos {

    String pedidos[];
    int top;
    int tamaño;

    // constructor
    public pilapedidos(int tamaño){
        this.tamaño = tamaño;
        pedidos = new String[tamaño];
        top = -1;
    }

    // verificar si esta vacia
    public boolean isEmpty(){
        return top == -1;
    }

    // agregar pedido
    public void push(String pedido){

        if(top == tamaño - 1){
            System.out.println("La pila de pedidos esta llena");
            return;
        }

        top++;
        pedidos[top] = pedido;

        System.out.println("Pedido preparado: " + pedido);
    }

    // entregar pedido
    public void pop(){

        if(isEmpty()){
            System.out.println("No hay pedidos");
            return;
        }

        System.out.println("Pedido entregado: " + pedidos[top]);
        top--;
    }

    // ver ultimo pedido
    public void peek(){

        if(isEmpty()){
            System.out.println("No hay pedidos");
            return;
        }

        System.out.println("Ultimo pedido listo: " + pedidos[top]);
    }

    // mostrar pedidos
    public void mostrar(){

        if(isEmpty()){
            System.out.println("No hay pedidos en la pila");
            return;
        }

        System.out.println("Pedidos listos para entregar:");

        for(int i = top; i >= 0; i--){
            System.out.println(pedidos[i]);
        }
    }
}