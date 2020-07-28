package dmoj;

import java.io.*;
import java.util.*;

public class CCC_11_S1_EnglishOrFrench {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine().trim());
        int tCount = 0;
        int sCount =0;
        for (int i = 0; i < N; i++) {
            String[] line = in.readLine().split("");
            for (int j = 0; j < line.length; j++) {
                if (line[j].equalsIgnoreCase("T"))
                    tCount++;
                else if (line[j].equalsIgnoreCase("S"))
                    sCount++;
            }
        }

        if (tCount>sCount)
            out.write("English");
        else if (sCount>tCount)
            out.write("French");
        else if (sCount==tCount)
            out.write("French");

        out.close();

    }
}
