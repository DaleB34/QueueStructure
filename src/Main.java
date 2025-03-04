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

        System.out.println("\nRemoving the first item ");
        q.pop();
        q.showList();

        System.out.println();

        //testing to see that deleting from an empty list won't crash the system
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();

        Queue r = new Queue();
        r.push(0);
        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);
        r.push(5);
        r.push(6);

        System.out.println("\nFull List");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        System.out.println("Removing from the start");
        r.showList();
        r.pop();
        r.showList();

    }
}