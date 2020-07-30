
public class ReturnKthToLast {
    public static Node returnKthToLast(Node head, int k) {
        int n = 0;
        Node iter = head;

        while (iter != null) {
            n++;
            iter = iter.next;
        }
        iter = head;
        for(int i = 0; i < n-k; i++) {
            iter = iter.next;
        }
        return iter;
    }

    public static void main(String[] args) {
        Node n = new Node(1); // 1 2 3 1 2 3 -> 1 2 3
        int[] data = { 2, 3, 1, 2, 3, 6, 7, 8, 9};
        Node iter = n;
        for(int i : data) {
            iter.next = new Node(i);
            iter = iter.next;
        }
        Node kth = returnKthToLast(n, 3);
        System.out.println(kth.data);
    }
}