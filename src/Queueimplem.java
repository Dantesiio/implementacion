public class Queueimplem<T> {
    private Node<T> front;
    private Node<T> back;

    public Queueimplem() {
        front = null;
        back = null;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(T e) {
        if (isEmpty()) {
            front = new Node<T>(e);
            back = front;
        } else {
            Node<T> newNode = new Node<T>(e);
            back.setNext(newNode);
            back = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> node = front;
            front = front.getNext();
            return node.getElement();
        }
    }
}


