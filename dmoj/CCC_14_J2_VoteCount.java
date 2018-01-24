package dmoj;

import java.io.*;
import java.util.*;

public class CCC_14_J2_VoteCount {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine().trim());
        String[] line = in.readLine().split("");
        int aCount =0;
        int bCount =0;
        for (int i = 0; i < N; i++) {
            if (line[i].equals("A"))
                aCount++;
            else if (line[i].equals("B"))
                bCount++;
        }

        if (aCount>bCount)
            out.write("A");
        else if (bCount>aCount)
            out.write("B");
        else if (aCount==bCount)
            out.write("Tie");

        out.close();

    }
}
