package UE2_WagonLinkedList;

public class WagonLinkedList {

    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {

      Node newNode = new Node();
      newNode.setWagonId(wagonId);

        if (first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
      // Fall: Liste ist leer
        if(first == null)
            return;
      // Fall: ein Element
        else if(first == last){
            first = null;
            last = null;
        }else{
            last.getPrev().setNext(null);
            last = last.getPrev();

         //   Node helpNode = last.getPrev();
         //   helpNode.setNext(null);
         //   last = helpNode;
        }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
