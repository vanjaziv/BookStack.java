package UE3_BookStack;

public class BookStack
{
    private Node top;



    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle) {

            Node newNode = new Node(bookTitle);
            newNode.setNext(top);
            top = newNode;
//       if(top == null){
//           top = newNode;
//       }
//       else{
//           newNode.setNext(top);
//           top = newNode;
//
//       }
        }

    public String pop() throws StackEmptyException
    {
        // Fall: Stack ist leer
        if (top == null)
            throw new StackEmptyException();
        // Fall: Stack ist nicht leer
        else{
            String returnString = top.getBookTitle();
            top = top.getNext();
            return returnString;
        }
    }

    public int getCount()
    {
        // TODO: Implementierung
        return 0;
    }
}
