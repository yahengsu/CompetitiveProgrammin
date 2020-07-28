package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class BirthdayChocolate {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));


        int n = readInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = readInt();
        }

        int d = readInt();
        int m = readInt();
        int count = 0;

        if(n == 1){
            if(a[0] == d)
                out.write("1");
            else
                out.write("0");
        }
        else{
            for(int i = 0; i <= n-m; i++){
                int sum = 0;
                for(int j = 0; j< m; j++){
                    sum += a[i+j];
                }
                if(sum == d)
                    count++;
            }

            out.write(String.valueOf(count));
        }



        out.close();
    }

    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine().trim());
        return st.nextToken();
    }

    static long readLong () throws IOException {
        return Long.parseLong(next());
    }

    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter () throws IOException {
        return next().charAt(0);
    }

    static String readLine () throws IOException {
        return in.readLine().trim();
    }
}

