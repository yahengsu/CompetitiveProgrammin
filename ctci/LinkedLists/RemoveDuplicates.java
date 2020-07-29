package LinkedLists;
import java.util.HashSet;

import java.util.*;

public class RemoveDuplicates {
    public static void removeDuplicates(Node node) {
        Set<Integer> dups = new HashSet<>();

        Node iter = node;
        Node prev = node;
        while (iter != null) {
            int val = iter.data;
            if (dups.contains(val)) {
                prev.next = iter.next;
                iter = iter.next;
            } else {
                dups.add(val);
                prev = iter;
                iter = iter.next;
            }
           
        }
    }

    public static void main(String[] args) {
        int[] data = { 2, 3, 1, 2, 3, 2, 2, 2, 2};
        Node n = new Node(1); // 1 2 3 1 2 3 -> 1 2 3
        Node iter = n;
        for(int i : data) {
            iter.next = new Node(i);
            iter = iter.next;
        }
        removeDuplicates(n);
        iter = n;
        while (iter != null) {
            System.out.println(iter.data);
            iter = iter.next;
        }
    }
}