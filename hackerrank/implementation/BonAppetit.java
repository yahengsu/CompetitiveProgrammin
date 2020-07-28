package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;
public class BonAppetit {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] secondLine = in.readLine().split(" ");
        int[] a = new int[n];
        int b = Integer.parseInt(in.readLine().trim());

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(secondLine[i]);
        }

        int total = 0;

        for(int i = 0; i < n; i++){
            if (i!=k){
                total += a[i];
            }
        }

        if ((total/2) == b)
            out.write("Bon Appetit");
        else
            out.write(String.valueOf(b-(total/2)));

        out.close();
    }
}
