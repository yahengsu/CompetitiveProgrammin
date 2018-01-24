package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class DrawingBook {//Template forked from https://github.com/jeffrey-xiao/competitive-programming/blob/master/src/codebook/Template.java
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));

        int n = readInt();
        int p = readInt();
        int pages;
        if(n-p<p-1){
             pages = (int) Math.ceil((n-p)/2);
        }
        else{
             pages = (int) Math.ceil(p/2);
        }

        out.write(String.valueOf(pages));



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

