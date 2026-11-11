package partD.ex12;

import stack.*;

// Example 12 has no demo on the slides; this small LinkedStackDemo just exercises LinkedStack.
public class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack<Integer> s = new LinkedStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("size: " + s.size());
        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("isEmpty: " + s.isEmpty());
    }
}
