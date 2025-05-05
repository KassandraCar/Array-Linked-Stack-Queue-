public class LinkedStack<T> implements MyStack<T> {
    
    private static class ListNode<T>{
        private final T data;
        private ListNode<T> next;

        private ListNode(T data, ListNode<T> next){
            this.data = data;
            this.next = next;
        }

        private ListNode(T data){
            this.data = data;
        }
    }

    private ListNode<T> head;
    private int size;

    public LinkedStack(){
        head = null;
        size = 0;
    }

    public void push (T element){
        head = new ListNode<>(element, head);
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("empty");
        }
        T value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Empty");
        }
        return head.data;
    }

    public boolean isEmpty(){
            return size == 0;
    }

    public int size(){
        return size;
    }

}
