import java.util.NoSuchElementException;

/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * 
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     *
     * This add may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null)
           throw new IllegalArgumentException();

        if (this.size >= this.backingArray.length)
            resize();

        if (this.size > 0)
            shiftToRight(0);

        this.backingArray[0] = data;
        this.size++;
    }

    /**
     * Adds the data to the back of the list.
     *
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null)
            throw new IllegalArgumentException();

        if (this.size >= this.backingArray.length)
            resize();

        if (this.size == 0) {
            this.backingArray[0] = data;

        }
        else
            this.backingArray[this.size] = data;

        this.size++;
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Do not shrink the backing array.
     *
     * This remove may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
         if (this.size == 0)
            throw new NoSuchElementException();

        T toReturn = this.backingArray[0];
        this.backingArray[0] = null;
        shiftToLeft(1);
        this.size--;
        this.backingArray[this.size] = null;
        return toReturn;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Do not shrink the backing array.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
         if (this.size == 0)
            throw new NoSuchElementException();
        
        T data = this.backingArray[this.size - 1];
        this.backingArray[this.size - 1] = null;
        this.size--;
        return  data;
    }

    /**
     * Returns the backing array of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
    
    private void shiftToRight(int index)
    {
        for (int i = size; i > index; i--)
            this.backingArray[i] = this.backingArray[i - 1];
    }

    
    private void shiftToLeft(int startingIndex)
    {
        for (int i = startingIndex; i < this.size; i++)
            this.backingArray[i - 1] = this.backingArray[i];
    }

    private void resize()
    {
        T[] temp_array = (T[]) new Object[this.backingArray.length * 2];
        
        for (int i = 0; i < this.backingArray.length; i++)
            temp_array[i] = this.backingArray[i];

        this.backingArray = temp_array;
    }
}