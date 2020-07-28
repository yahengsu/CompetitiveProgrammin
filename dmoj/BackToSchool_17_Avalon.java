package dmoj;

import java.io.*;
import java.util.*;

public class BackToSchool_17_Avalon {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int G = Integer.parseInt(in.readLine().trim());
        double[] a = new double[G];
        for (int i = 0; i < G; i++) {
            String[] nLine = in.readLine().split(" ");
            double e = Double.parseDouble(nLine[0]);
            double p = Double.parseDouble(nLine[1]);
            double probability = ((p - e) / p);

            a[i] = probability;
        }

        double x = 1;

        for (int i = 0; i < G; i++) {
            x*=a[i];
        }

        out.write(String.valueOf(x));

        out.close();
    }
}
