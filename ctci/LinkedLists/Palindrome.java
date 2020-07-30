import java.util.HashMap;

import java.util.HashMap;

public class Palindrome {
    public static boolean isPalindrome (Node n) {
        HashMap<String> letters = new HashMap<>();

        
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
        n = new Node("p");
        iter = n;
        for(String i :  is) {
            iter.next = new Node(i);
            iter = iter.next;
        }
       System.out.println(isPalindrome(n));

       
    }
}