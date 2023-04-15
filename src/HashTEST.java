import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTEST {

    @Test
    public void testInsertAndGet() {
        HashTable<Integer> ht = new HashTable<>();
        ht.insert(1);
        ht.insert(2);
        ht.insert(3);
        Assertions.assertEquals(3, ht.getSize());
        Assertions.assertTrue(ht.contains(1));
        Assertions.assertTrue(ht.contains(2));
        Assertions.assertTrue(ht.contains(3));
    }
//NO LE SUPE A OTRO :C
    @Test
    public void testSizeAfterRemovingItem() {
        HashTable<String> ht = new HashTable<>();
        ht.remove("a");
        Assertions.assertEquals(2, ht.getSize());
    }



    @Test
    public void testRemove() {
        HashTable<Character> ht = new HashTable<>();
        ht.insert('a');
        ht.insert('b');
        ht.insert('c');
        ht.insert('d');
        Assertions.assertEquals(4, ht.getSize());
        Assertions.assertTrue(ht.contains('a'));
        Assertions.assertTrue(ht.contains('b'));
        Assertions.assertTrue(ht.contains('c'));
        Assertions.assertTrue(ht.contains('d'));
        ht.remove('a');
        ht.remove('c');
        Assertions.assertEquals(2, ht.getSize());
        Assertions.assertFalse(ht.contains('a'));
        Assertions.assertTrue(ht.contains('b'));
        Assertions.assertFalse(ht.contains('c'));
        Assertions.assertTrue(ht.contains('d'));
    }
}

