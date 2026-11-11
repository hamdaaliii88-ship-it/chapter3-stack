package partC.ex07;

import stack.*;

// Example 7 has no demo on the slides; this small ArrayStackDemo just exercises ArrayStack.
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("size: " + s.size() + ", capacity: " + s.capacity());
        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("isEmpty: " + s.isEmpty());
    }
}
