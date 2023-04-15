public class StackImplem<T> {
    private Node<T> top;

    public StackImplem() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T e) {
        if (isEmpty()) {
            top = new Node<T>(e);
        } else {
            Node<T> newNode = new Node<T>(e);
            newNode.setNext(top);
            top = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> node = top;
            top = top.getNext();
            return node.getElement();
        }
    }
}
