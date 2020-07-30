public class SumLists {
    public static Node sumLists(Node n1, Node n2) {
        Node n = new Node(0);
        Node iter = n;
        boolean carry = false;
        while (n1 != null || n2 != null) {
            int v1 = n1 != null ? n1.data : 0;
            int v2 = n2 != null ? n2.data : 0;

            int sum = v1 + v2;
            if (carry) {
                sum += 1;
                carry = false;
            }

            if (sum > 9) {
                carry = true;
            }
            iter.next = new Node(sum%10);
            iter = iter.next;
            n1 = n1.next;
            n2 = n2.next;
        }
        return n.next;
    }

    //for forward summing, we need a prev pointer to keep track of the carry

    public static void main(String[] args) {
        int[] data1 = {1, 6};
        int[] data2 = {9, 2};
        Node n1 = new Node(7);
        Node n2 = new Node(5);
        Node iter1 = n1;
        Node iter2 = n2;
        for(int i : data1) {
            iter1.next = new Node(i);
            iter1 = iter1.next;
        }
        for (int i : data2) {
            iter2.next = new Node(i);
            iter2 = iter2.next;
        }
        n1 = sumLists(n1, n2);

        iter1 = n1;
        while (iter1 != null) {
            System.out.println(iter1.data);
            iter1 = iter1.next;
        }
    }
}