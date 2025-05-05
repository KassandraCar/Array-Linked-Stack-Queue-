import java.util.ArrayList;

public class ArrayQueue<T> implements MyQueue<T>{

    private T[] array;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(){
        array = (T[]) new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue (T element){
        if(size == array.length) {
            resize();
        }
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("empty");
        }
        T element = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return element;
    }

    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("empty");
        }
        return array[head];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void resize(){
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(head + i) % array.length];
        }
        head = 0;
        tail = size;
        array = newArray;
    }
}
