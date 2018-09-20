package dmoj;

import java.io.*;
import java.util.*;

public class DMOPC18_Contest1_P0_Sorting {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

       
        int a = Integer.parseInt(in.readLine().trim());
        int b = Integer.parseInt(in.readLine().trim());
        int c = Integer.parseInt(in.readLine().trim());
        if(a <= b && b <= c) {
            out.write("Good job!");
        }
        else {
            out.write("Try again!");
        }

        out.close();
    }
}
