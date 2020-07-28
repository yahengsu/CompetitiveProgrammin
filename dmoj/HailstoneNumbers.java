package dmoj;

import java.io.*;
import java.util.*;

public class HailstoneNumbers {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine().trim());
        int count =0;


        while (N!=1)
        {
            if (N%2 != 0)
            {
                N = (N*3) +1;
                count++;
            }
            else if (N%2 == 0)
            {
                N = N/2;
                count++;
            }
        }

        out.write(String.valueOf(count));

        out.close();


    }
}
