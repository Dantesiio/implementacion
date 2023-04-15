import java.util.LinkedList;

public class HashTable<T> {
    private final int size = 19;
    private LinkedList<T>[] table;

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = (LinkedList<T>[]) new LinkedList[size];
    }

    private int hash(T key) {
        return key.hashCode() % size;
    }

    public void insert(T key) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<T>();
        }
        table[index].add(key);
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                size += table[i].size();
            }
        }
        return size;
    }

    public boolean contains(T key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }
        return table[index].contains(key);
    }

    public void remove(T key) {
        int index = hash(key);
        if (table[index] == null) {
            return;
        }
        table[index].remove(key);
    }
}

