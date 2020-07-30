import java.util.*;
public class Palindrome {
    public static boolean isPalindrome (Node n) {
        if (n == null) {
            return false;
        }
        Deque<String> s = new ArrayDeque<>();
        s.add(n.sData);
        Node prev = n;
        Node curr = n.next;
        Node next = curr.next;
        while(curr.next != null) {
            s.add(curr.sData);
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        s.add(curr.sData);

        while (s.size() > 0 && curr != null) {
            if (s.pop() != curr.sData) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] not = {"a", "l", "i", "n", "d", "r", "o", "m", "e"};
        String[] is = {"a", "n", "a", "p"};
        Node n = new Node("p");
        Node iter = n;
        for(String i :  not) {
            iter.next = new Node(i);
            iter = iter.next;
        }
        System.out.println(isPalindrome(n));
        Node b = new Node("p");
        iter = b;
        for(String i :  is) {
            iter.next = new Node(i);
            iter = iter.next;
        }
       System.out.println(isPalindrome(b));

       
    }
}