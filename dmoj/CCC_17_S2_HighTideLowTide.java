package dmoj;

import java.io.*;
import java.util.*;

public class CCC_17_S2_HighTideLowTide {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(in.readLine().trim());
        int[] a = new int[N];
        String[] line = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(a);
        if (N%2 == 0)
        {
            for (int i = 0; i < N/2; i++) {
                out.write(a[(N/2)-1-i] + " " + a[(N/2)+i]);
                if (i<(N/2)-1)
                    out.write(" ");
            }
        }
        else if (N%2 == 1)
        {
            for (int i = 0; i < N/2; i++) {
                out.write(a[(N/2)-i] + " " +a[(N/2)+1+i] + " ");
            }
            out.write(String.valueOf(a[0]));

        }



        out.close();
    }
}
