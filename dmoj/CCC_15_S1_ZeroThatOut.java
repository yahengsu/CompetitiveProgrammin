package dmoj;

import java.util.*;
import java.io.*;
import java.math.*;

public class CCC_15_S1_ZeroThatOut {

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(in.readLine().trim());
        ArrayList<Integer> a = new ArrayList<>(K);
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int X = Integer.parseInt(in.readLine().trim());
            if (X == 0)
            {
                int temp = a.get(a.size()-1);
                sum -= temp;
                a.remove(a.size()-1);
            }
            else
            {
                a.add(X);
                sum += X;
            }
        }


        out.write(String.valueOf(sum));
        out.close();
    }
}