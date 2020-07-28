package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class BetweenTwoSets {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = in.readLine().split(" ");
        String[] secondLine = in.readLine().split(" ");
        String[] thirdLine = in.readLine().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[] a = new int[n];
        int[] b = new int[m];

        for(int  i = 0; i < n; i++){
            a[i] = Integer.parseInt(secondLine[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(thirdLine[i]);
        }

        int count  = 0;





        out.close();
    }
}
