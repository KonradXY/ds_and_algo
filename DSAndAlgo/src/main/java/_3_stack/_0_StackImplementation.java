package _3_stack;

public class _0_StackImplementation {

    public class Stack<Item> {

        private Node top = null;

        private class Node {
            Item item;
            Node next;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void push(Item item) {
            Node oldTop = top;
            top = new Node();
            top.item = item;
            top.next = oldTop;
        }

        public Item pop() {
            Item item = top.item;
            top = top.next;
            return item;
        }
    }

    public class FixedCapacityStackOfStrings {

        private String[] s;
        private int N = 0;

        public FixedCapacityStackOfStrings(int capacity) {
            s = new String[capacity];
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public void push(String item) {
            s[N++] = item;
        }

        public String pop() {
            return s[--N];
        }
    }
}
