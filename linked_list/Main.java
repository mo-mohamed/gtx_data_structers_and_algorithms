import java.util.NoSuchElementException;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("helloooo");
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        try{
            System.out.println("REMOVE FROM FRONT WHILE LIST IS EMPTY");
            myList.removeFromFront();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("REMOVE FROM FRONT WHILE LIST IS EMPTY EXCEPTIN WAS RAISED");
        }

        try{
            System.out.println("REMOVE FROM BACK WHILE LIST IS EMPTY");
            myList.removeFromBack();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("REMOVE FROM BACK WHILE LIST IS EMPTY EXCEPTIN WAS RAISED");
        }

        try{
            System.out.println("ADD TO THE FRONT WITH NULL DATA");
            myList.addToFront(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("ADD TO THE FRONT WITH NULL DATA WAS RAISED");
        }

        try{
            System.out.println("ADD TO THE BAK WITH NULL DATA");
            myList.addToBack(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("ADD TO THE BAK WITH NULL DATA WAS RAISED");
        }

        System.out.println("****************************************");
        System.out.println("TEST Adding to front and back");
        myList.addToFront("A1");
        myList.addToFront("A2");
        myList.addToFront("A3");
        myList.addToBack("B1");
        myList.addToBack("B2");
        myList.addToFront("A4");
        System.out.println("LIST SIZE IS: " + myList.size());
        SinglyLinkedListNode<String> current = myList.getHead();
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println("TEST REMOVE FROM FRONT");
        System.out.println("LIST SIZE IS: " + myList.size());
        myList.removeFromFront();
        myList.removeFromFront();
        System.out.println("LIST SIZE IS: " + myList.size());
        current = myList.getHead();
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }

        System.out.println("TEST REMOVE FROM BACK");
        System.out.println("LIST SIZE IS: " + myList.size());
        myList.removeFromBack();
        myList.removeFromBack();
        myList.removeFromBack();
        myList.removeFromBack();
        
        System.out.println("LIST SIZE IS: " + myList.size());
        System.out.println(myList.getHead() == null);
        System.out.println(myList.getTail());
        current = myList.getHead();
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }

        
    }
}
