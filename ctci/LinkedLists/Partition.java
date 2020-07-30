public class Partition {
    public static Node partition(Node head, int p) {
        Node small = new Node(0);
        Node smallIter = small;
        Node large = new Node(0);
        Node largerIter = large;

        Node iter = head;

        while (iter != null) {
            if (iter.data < p) {
                smallIter.next = new Node(iter.data);
                smallIter = smallIter.next;
            } else {
                largerIter.next = new Node(iter.data);
                largerIter = largerIter.next;
            }
            iter = iter.next;
        }
        smallIter.next = large.next;

        return small.next;
    }

    public static void main(String[] args) {
        int[] data = { 2, 3, 1, 2, 3, 2, 2, 2, 2};
        Node n = new Node(1);
        Node iter = n;
        for(int i : data) {
            iter.next = new Node(i);
            iter = iter.next;
        }
        n = partition(n, 2);

        iter = n;
        while (iter != null) {
            System.out.println(iter.data);
            iter = iter.next;
        }
    }
}