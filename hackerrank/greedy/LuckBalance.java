package hackerrank.greedy;

import java.util.*;
import java.io.*;
import java.math.*;

public class LuckBalance {
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main (String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        // br = new BufferedReader(new FileReader("in.txt"));
        // out = new PrintWriter(new FileWriter("out.txt"));

        int n = readInt();
        int k = readInt();
        ArrayList<Integer> important = new ArrayList<>();
        ArrayList<Integer> unimportant = new ArrayList<>();
        int luck = 0;

        for(int i = 0; i < n; i++){
            int contest = readInt();
            int importance = readInt();

            if(importance == 1){
                important.add(contest);
            }
            else{
                unimportant.add(contest);
            }
        }

        Collections.sort(important);

        for(int i  = 0; i < unimportant.size(); i++){
            luck += unimportant.get(i);
        }

        int loop = important.size()-k;
        for(int i  = 0; i < loop; i++){
            luck -= important.get(0);
            important.remove(0);
        }
        for(int i = 0; i < important.size(); i++){
            luck += important.get(i);
        }

        out.write(String.valueOf(luck));





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
