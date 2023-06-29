package interview.strings.arrays;

import java.util.Stack;
import java.util.Vector;

public class StackTest {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Test");
        vector.add(1, "new elem");
        System.out.println(vector);
        vector.set(1, "linkedlist");
        System.out.println(vector);
        //vector.set(vector.lastElement(), "QA");
        System.out.println(vector.lastElement());

        //System.out.println(test);
        Stack stack = new Stack();
        stack.push("hello");
        stack.push(10);
        stack.push(true);
        stack.push(12.22);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        //Object o = stack.search(2);
        System.out.println("ses " + stack.search(10));
        System.out.println(stack.size());
        System.out.println(stack.capacity());
        System.out.println(" hello " + vector.size());
        System.out.println("capcaity " + vector.capacity());
    }
}
