public class Creating_Stack_using_LinkedList02 {
    
    private static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static Node Head = null;

        public static boolean isEmpty() {
            return Head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                Head = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = Head.data;
            Head = Head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return Head.data;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
