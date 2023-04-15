import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class StackTest{

    @Test
    public void testPushAndPop() {
        StackImplem<Integer> stack = new StackImplem<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, (int) stack.pop());
        Assertions.assertEquals(2, (int) stack.pop());
        Assertions.assertEquals(1, (int) stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        StackImplem<String> stack = new StackImplem<>();
        Assertions.assertTrue(stack.isEmpty());
        stack.push("hola");
        Assertions.assertFalse(stack.isEmpty());
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        StackImplem<Double> stack = new StackImplem<>();
        Assertions.assertNull(stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }

}

