public class Queue
{

    private Node head;
    public Queue()
    {
        head = null;
    }

    public void push(int addData)
    {
        head = new Node(addData, head);
    }



    private class Node
    {
        private int data;
        private Node next;

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
