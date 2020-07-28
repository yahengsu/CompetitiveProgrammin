package leetcode.easy;

import java.util.*;
import java.io.*;

public class CodeJam {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    static int[] calc(int N) {
        int[] ret = new int[2];
        int digits = String.valueOf(N).length();
        System.out.println(digits);
        ret[0] = 11;
        ret[1] = 22;
        return ret;
    }

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));
        int T = readInt();
        for(int i = 0; i < T; i++) {
            int N = readInt();
            int[] a = calc(N);
            out.println("Case #" + (i + 1) + ": " + a[0] + " " + a[1]);
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

