package dmoj;

import java.io.*;
import java.util.*;

public class ListMinimumHard {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = in.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);


        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            String[] subsequentLines = in.readLine().split(" ");
            list[i] = Integer.parseInt(subsequentLines[0]);
        }
        Arrays.sort(list);
        for (int i = 0; i < N; i++) {
            System.out.println(list[i]);
        }
    }
}
