package UE4_BookingQueue;

public class BookingQueue
{
   private Node front;
   private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront()
    {
        // TODO: Implementierung vervollständigen
        return front;
    }


    // *** Operationen ***

    public void enqueue(Booking newBooking)
    {
        // Knoten anlegen
        Node newNode = new Node(newBooking);

        // Fall: Queue ist leer
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        // Fall: Queue ist nicht leer
        else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Booking dequeue() throws QueueEmptyException
    {
        // Fall: Queue ist leer
        if(front == null)
            throw new QueueEmptyException();
        // Fall: Queue besteht aus einen Knoten
        else if (front == rear){
            Booking returnBooking = front.getBooking();
            front = null;
            rear = null;
            return returnBooking;
        }
        // Fall: Queue besteht aus mehreren Knoten
        else{
            Booking returnBooking = front.getBooking();
            front = front.getNext();
            return returnBooking;
        }
    }

    public int getCount()
    {
        int counter = 0;
        Node currentNode = front;

        while(currentNode != null){
            counter++;
            currentNode = currentNode.getNext();
        }

        return counter;
    }
}
