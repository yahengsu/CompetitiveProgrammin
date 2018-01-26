package hackerrank.strings;

import java.util.*;
import java.io.*;
import java.math.*;

public class SuperReducedString {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    static String solve(String input){
        int slength = input.length();
        String temp = input;
        if(slength == 0){
            return "Empty String";
        }
        for(int i = 0; i < slength -1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                //substring front
                //substring back
                //recurse
            }
        }

    }

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));

        String input = readLine();
        String output = solve(input);

        out.write(output);

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
