public class LinkedList<T> {
  //  "AL FINAL NI LA USE"
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void add(T e) {
        Node<T> node = new Node<T>(e);
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
    }

    public int size() {
        int cont = 0;
        Node<T> node = head;
        while (node != null) {
            cont++;
            node = node.getNext();
        }
        return cont;
    }




}
