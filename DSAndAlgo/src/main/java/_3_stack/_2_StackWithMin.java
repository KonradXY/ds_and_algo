package _3_stack;

public class _2_StackWithMin {

    class Stack<ITEM extends Comparable<ITEM>> {
        private Node<ITEM> top = null;
        private Node<ITEM> min = null;

        public boolean isEmpty() {
            return top == null;
        }

        public void push(ITEM item) {
            Node<ITEM> oldTop = top;
            top = new Node<>(item);
            top.next = oldTop;

            Node<ITEM> oldMin = min;
            min = new Node<>(item.compareTo(oldMin.item) < 0 ? item : oldMin.item);
            min.next = oldMin;
        }

        public ITEM pop() {
            ITEM item = top.item;
            top = top.next;
            min = min.next;
            return item;
        }

        public ITEM top() {
            return top.item;
        }

        public ITEM getMin() {
            return min.item;
        }

    }


    private static class Node<ITEM> {
        ITEM item;
        Node<ITEM> next;

        public Node(ITEM item) {
            this.item = item;
        }
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
