package UE1_TodoLinkedList;

public class TodoLinkedList {
    private Node first;
    private Node last;


    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // TODO: Implementierung vervollständigen

            Node newNode = new Node();   // Neuen Knoten schaffen
            newNode.setToDoText(todoText);

            // Fall 1: Liste Leer
            if (first == null){
                first = newNode;
                last = newNode;
            }

            // Fall 2: Ein Element in der Liste
            else{
                last.setNext(newNode);
                last = newNode;
            }
    }


    public void deleteLastTodoText() {
        // TODO: Implementierung vervollständigen
        // Fall 1:  Liste ist Leer
        if(first == null){
            return; // keine Aktion notwendig
        }
        // Fall 2: Liste besteht aus 1 Node --> first = last

        else if(first == last){
            first = null;
            last = null;
        }
        // Fall 3: "Normal" - mehrere Knoten
        else{
            // Bis zum vorletzten Knoten weiterhüpfen
            Node prevNode = first;
            while(prevNode.getNext() !=null)
                prevNode = prevNode.getNext();
            prevNode.setNext(null);
            last = prevNode;
        }

    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
