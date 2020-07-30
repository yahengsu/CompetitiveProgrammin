
public class Node {
    public Node next = null;
    public int data;
    public String sData;
    public Node(int d) {
        data = d;
        sData = "";
    }
    public Node(String s) {
        sData = s;
        data = -1;
    }
}