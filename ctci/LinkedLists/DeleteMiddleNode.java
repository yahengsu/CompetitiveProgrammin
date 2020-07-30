
public class DeleteMiddleNode {
    public static void deleteMiddleNode(Node n) {
        if (n.next == null) {
            return;
        }
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public static void main(String[] args) {
        int[] data = { 2, 3, 1, 2, 9, 2, 7};
        Node n = new Node(1); // 1 2 3 1 2 3 -> 1 2 3
        Node iter = n;
        Node toDelete = null;
        for(int i : data) {
            iter.next = new Node(i);
            iter = iter.next;
            if (i == 9) {
                toDelete = iter;
            }
        }
        deleteMiddleNode(toDelete);

        iter = n;
        while (iter != null) {
            System.out.println(iter.data);
            iter = iter.next;
        }
    }
}