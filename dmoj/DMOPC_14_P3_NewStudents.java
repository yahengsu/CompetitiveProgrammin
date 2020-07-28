package dmoj;

import java.io.*;
import java.util.*;

public class DMOPC_14_P3_NewStudents {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(in.readLine().trim());
        double sum = 0;
        double avg;
        for (int i = 0; i < N; i++) {
            int original = Integer.parseInt(in.readLine().trim());
            sum += original;
        }
        double x = N;
        int S = Integer.parseInt(in.readLine().trim());
        for (int i = 0; i < S; i++) {
            sum += Integer.parseInt(in.readLine().trim());
            x++;
            avg = sum/x;
            out.write(String.valueOf(avg));
            out.newLine();
        }




        out.close();

    }
}
