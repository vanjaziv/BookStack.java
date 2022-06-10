package UE3_BookStack;

public class Node {
    private final String bookTitle;
    private Node next;

    public Node(String bookTitle) {
        this.bookTitle = bookTitle;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String bookTitle, Node next) {
        this.bookTitle = bookTitle;
        this.next = next;
    }
}

