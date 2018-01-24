package dmoj;

import java.io.*;
import java.util.*;

public class CCC_13_J1_NextInLine {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int Y = Integer.parseInt(in.readLine().trim());
        int M = Integer.parseInt(in.readLine().trim());
        int diff = M - Y;
        out.write(String.valueOf(M+diff));



        out.close();
    }
}
