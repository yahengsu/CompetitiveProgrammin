package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine().trim());
        String[] secondLine = in.readLine().split(" ");
        int[] a = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(secondLine[i]);
            if(a[i] > max){
                max = a[i];
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == max)
                count++;
        }

        out.write(String.valueOf(count));
        out.newLine();
        out.close();
    }
}
