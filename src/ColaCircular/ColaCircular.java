    package ColaCircular;

public class ColaCircular {

    int cola[];
    int front;
    int rear;
    int tamaño;

    public ColaCircular(int tamaño){
        this.tamaño = tamaño;
        cola = new int[tamaño];
        front = -1;
        rear = -1;
    }

    // verificar si esta vacia
    public boolean isEmpty(){
        return front == -1;
    }

    // agregar pedido
    public void enqueue(int pedido){

        if((rear + 1) % tamaño == front){
            System.out.println("La cola esta llena (overflow)");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear + 1) % tamaño;
        cola[rear] = pedido;

        System.out.println("Pedido agregado: " + pedido);
    }

    // eliminar pedido
    public int dequeue(){

        if(isEmpty()){
            System.out.println("La cola esta vacia (underflow)");
            return -1;
        }

        int dato = cola[front];

        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % tamaño;
        }

        return dato;
    }

    // ver primer pedido
    public int peek(){

        if(isEmpty()){
            System.out.println("La cola esta vacia");
            return -1;
        }

        return cola[front];
    }

    // mostrar cola
    public void mostrar(){

        if(isEmpty()){
            System.out.println("No hay pedidos");
            return;
        }

        int i = front;

        System.out.print("Pedidos en estaciones: ");

        while(i != rear){
            System.out.print(cola[i] + " ");
            i = (i + 1) % tamaño;
        }

        System.out.print(cola[rear]);
        System.out.println();
    }

}