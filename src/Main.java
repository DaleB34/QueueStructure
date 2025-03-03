public class Main {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        q.showList();

        System.out.println("\nRemoving one from the end ");
        q.pop();
        q.showList();

        System.out.println();

        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();

    }
}