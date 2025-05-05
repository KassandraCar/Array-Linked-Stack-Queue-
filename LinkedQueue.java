public class LinkedQueue<E> implements MyQueue<E>{

    private static class ListNode<E>{
        private final E data;
        private ListNode<E> next;

        private ListNode(E data, ListNode<E> next){
            this.data = data;
            this.next = next;
        }

        private ListNode(E data){
            this.data = data;
        }
    }

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue (E element){
        ListNode<E> newNode = new ListNode<>(element);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E dequeue(){
        if(head == null){
            throw new IllegalStateException("empty");
        }
        E value = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public E peek(){
        if (head == null) {
            throw new IllegalStateException("empty");
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
