import java.util.*;

public class Intersection {
    public static Node intersect(Node n1, Node n2) {
        Node iter1 = n1;
        Node iter2 = n2;
        int c1 = 0;
        int c2 = 0;
        //traver se to tail
        while (iter1 != null) {
            iter1 = iter1.next;
            c1++;
        }

        while (iter2 != null) {
            iter2 = iter2.next;
            c2++;
        }
        //intersection if tails are equal
        if (iter1 == iter2) {
            iter1 = n1;
            iter2 = n2;
            //offset pointers to accomodate for different lengths
            while (c1 != c2) {
                if (c1 > c2) {
                    iter1 = iter1.next;
                    c1--;
                } else {
                    iter2 = iter2.next;
                    c2--;
                }
            }
            //same length, traverse to find first intersection
            while (iter1 != null) {
                if (iter1 == iter2) 
                    return iter1;

                iter1 = iter1.next;
                iter2 = iter2.next;
                
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] not = {"a", "l", "i", "n", "d", "x", "r", "o", "m", "e"};
        String[] is = {"a", "n", "x", "a", "p"};
        String[] no = {"a", "l", "i", "n", "d", "r", "o", "m", "e"};
        Node ints = new Node("LOL");
        Node n = new Node("p");
        Node b = new Node("p");
        Node noint = new Node("a");
        Node iter = n;
        for(String i :  not) {
            if (i == "x") {
                iter.next = ints;
            } else {
                iter.next = new Node(i);
            }
            iter = iter.next;
        }
        
        iter = b;
        for(String i :  is) {
            if (i == "x") {
                iter.next = ints;
            } else {
                iter.next = new Node(i);
            }
            iter = iter.next;
        }
        System.out.println(intersect(n,b)); // true

        iter = noint;
        for(String i :  no) {
            iter.next = new Node(i);
            iter = iter.next;
        }
        System.out.println(intersect(n,noint)); // false

    }
}