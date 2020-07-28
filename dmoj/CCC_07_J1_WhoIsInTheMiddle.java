package dmoj;

import java.io.*;
import java.util.*;

public class CCC_07_J1_WhoIsInTheMiddle {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[3];
        x[0] = Integer.parseInt(in.readLine().trim());
        x[1] = Integer.parseInt(in.readLine().trim());
        x[2] = Integer.parseInt(in.readLine().trim());

        Arrays.sort(x);
        out.write(String.valueOf(x[1]));



        out.close();

    }
}
