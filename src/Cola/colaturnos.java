package Cola;

public class ColaTurnos {
// Definicion de variables 
    int [] turnos;
    int front;
    int rear;
    int colacapacidad;

// La siguiente clase implementa una cola que gestiona los turnos del cliente
// El constructor definen es el metodo que se utiliza para crear una Cola
    ColaTurnos (int tamaño){
        colacapacidad = tamaño; // Guarda el tamaño de la cola y crea el arreglo turnos
        turnos = new int[tamaño];
 // El inicializar el frony y rear en -1 indica que nuestra cola está vacía       
        front = -1; // Es la posición del primer cliente
        rear = -1; // Es la posición del último cliente
    }

// Metodo para agregar un turno a la cola 
//Agrgar turno
public void enqueue(int turnoCliente){
// Verificar si la cola está llena
    if (rear == colacapacidad -1){
        System.out.println("La cola de turnos está llena"); //Si esta llena mostrara este mensaje
    }
        else{
        if (front == -1)
            front = 0;
    rear = rear +1;
    turnos[rear] = turnoCliente; //Guardar turno en el arreglo

    }
}
//Este métod regresa un valor, porque devuelve el turno atendido
//Atender turno
public int dequeue(){
// Verificar si la cola está vacía
    if (front == -1){
        System.out.println("La cola esta vacia");
        return -1;
    }

    int turnoAtendido = turnos[front]; //Guarda el turno que sera el siguiente en atender
    front = front +1;

    if (front > rear){ //Verifica si la cola esta vacía 
        front = -1; 
        rear = -1;
    }
    
    return turnoAtendido; //Devuelve el turno

}
//Este método nos mostrara los turnos que están esperando
public void mostrarCola(){ 
    if (front == -1){
        System.out.println("No hay turnos en espera");
        return;

    }
    for (int i = front; i <= rear; i++) //Recorre todos los turnos que están en espera
        System.out.println(turnos[i]);
}


}
