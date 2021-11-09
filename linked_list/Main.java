public class Main {
    public static void main(String[] args)
    {
        System.out.println("helloooo");
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        myList.addToFront("A1");
        myList.addToFront("A2");
        myList.addToFront("A3");
        myList.addToBack("B1");
        myList.addToFront("A4");
        SinglyLinkedListNode<String> current = myList.getHead();
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }

        
    }
}
