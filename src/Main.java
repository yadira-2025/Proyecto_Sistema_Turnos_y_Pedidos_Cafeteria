import Cola.ColaTurnos;
import ColaCircular.ColaCircular;
import Pila.pilapedidos;
import Lista.LstProductos;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Sistema de cafeteria Universitaria");
        System.out.println("Proyecto P2 de Estructura de Datos");

        ColaTurnos turnos = new ColaTurnos(5);

        turnos.enqueue(1);
        turnos.enqueue(2);
        turnos.enqueue(3);

        System.out.println("Turnos en espera:");
        turnos.mostrarCola();

        System.out.println("Atendiendo turno: " + turnos.dequeue());

        turnos.mostrarCola();


        LstProductos menu = new LstProductos();

        menu.agregarProducto("Cafe Americano", 35);
        menu.agregarProducto("Capuccino", 45);
        menu.agregarProducto("Latte", 50);

        System.out.println("Menu de productos:");
        menu.mostrarProductos();


        ColaCircular cafeteria = new ColaCircular(5);

        cafeteria.enqueue(1);
        cafeteria.enqueue(2);
        cafeteria.enqueue(3);

        cafeteria.mostrar();

        System.out.println("Primer pedido: " + cafeteria.peek());

        cafeteria.dequeue();

        cafeteria.mostrar();

        pilapedidos pedidos = new pilapedidos(5);

        pedidos.push("Cafe Americano");
        pedidos.push("Capuccino");
        pedidos.push("Latte");

        pedidos.mostrar();

        pedidos.pop();

        pedidos.peek();
    }
}