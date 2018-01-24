package hackerrank.implementation;
import java.util.*;
import java.io.*;
import java.math.*;

public class MinMaxSum {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] firstLine = in.readLine().split(" ");
        Long[] a = new Long[firstLine.length];
        for(int i = 0; i< firstLine.length; i++){
            a[i] = Long.parseLong(firstLine[i]);
        }

        Arrays.sort(a);
        long sum = 0;
        for(int i =0; i<a.length; i++){
            sum +=a[i];
        }
        long minSum = sum-a[a.length-1];
        long maxSum = sum-a[0];
        out.write(String.valueOf(minSum) + " " + String.valueOf(maxSum));

        out.close();
    }
}
