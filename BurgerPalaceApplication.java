

import java.util.LinkedList;


public class BurgerPalaceApplication 
{
    public static void main(String[] args) 
    {
        Queue<String> burgerQueue = new Queue<>();

        // Enqueue initial customers
        burgerQueue.enqueue("Bill");
        burgerQueue.enqueue("Alice");
        burgerQueue.enqueue("Bob");

        // Print the queue after each operation
        printQueue("Initial queue:", burgerQueue);

        // Serve a customer
        serveCustomer(burgerQueue);

        // Jane arrives
        burgerQueue.enqueue("Jane");
        printQueue("Jane arrives:", burgerQueue);

        // Hamad arrives
        burgerQueue.enqueue("Hamad");
        printQueue("Hamad arrives:", burgerQueue);

        // Serve two customers
        serveCustomer(burgerQueue);
        serveCustomer(burgerQueue);
        printQueue("Two customers are served:", burgerQueue);

        // Jim arrives
        burgerQueue.enqueue("Jim");
        printQueue("Jim arrives:", burgerQueue);

        // Serve another customer
        serveCustomer(burgerQueue);
        printQueue("Another customer is served:", burgerQueue);

        // Serve another customer
        serveCustomer(burgerQueue);
        printQueue("Another customer is served:", burgerQueue);
    }

    // Helper method to serve a customer
    private static void serveCustomer(Queue<String> queue) 
    {
        String servedCustomer = queue.dequeue();
        System.out.println("Serving customer: " + servedCustomer);
    }

    // Helper method to print the queue
    private static void printQueue(String message, Queue<String> queue) 
    {
        System.out.println(message);
        Object[] array = queue.toArray();
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
