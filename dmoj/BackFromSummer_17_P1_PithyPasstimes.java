package dmoj;

import java.io.*;
import java.util.*;

public class BackFromSummer_17_P1_PithyPasstimes {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine().trim());

        ArrayList<String> a = new ArrayList<>();
        String[] secondLine = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if (secondLine[i].length()<=10)
                a.add(secondLine[i]);
        }

        out.write(String.valueOf(a.size()));

        out.close();
    }
}
