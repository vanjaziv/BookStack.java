package UE1_TodoLinkedList;

public class Node {
    private String ToDoText; //Wert=Text
    private Node next;       //Referenz


    public String getToDoText() {
        return ToDoText;
    }

    public void setToDoText(String toDoText) {
        ToDoText = toDoText;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}