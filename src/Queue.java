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

    public void pop()
    {
        //remove the first item added
            if (head == null)
            {
                System.out.println("Deleting from an empty list");
                System.exit(0);
            }
            else if(amountOfNodes() > 1) {
                Node position = head;
                while (position.getNext().getNext() != null) {
                    position = position.getNext();
                }

                position.next = null;
            }
            else
            {
                head = head.getNext();
            }
    }

    public int amountOfNodes()
    {
        int count = 0;
        Node position = head;
        while(position!= null)
        {
            count++;
            position = position.getNext();
        }
        return count;
    }

    public void showList()
    {
        Node position = head;
        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getNext();
        }
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
