public class ArrayStack<T> implements MyStack<T> {
    private T[] data;
    private int size;

    public ArrayStack() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public void push(T element){
        if(size == data.length){
            resize();
        }
        data[size] = element;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Empty");
        }
        T topElement = data[size - 1];
        data[size - 1] = null;
        size--;
        return topElement;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("empty");
        }
        return data[size -1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    private void resize(){
        T[] newArray = (T[]) new Object[data.length * 2];
        for(int i = 0; i < size; i++){
            newArray[i] = data[i];
        }
        data = newArray;
    }
}
