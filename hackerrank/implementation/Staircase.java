package hackerrank.implementation;
import java.util.*;
import java.io.*;
import java.math.*;

public class Staircase {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine().trim());
        int x = 1;
        int space = n-1;

        for(int i=0;i<n;i++){
            for(int j=0; j<space; j++){
                out.write(" ");
            }
            for(int j=0;j<x;j++){
                out.write("#");
            }
            out.newLine();
            x++;
            space--;
        }

        out.close();
    }
}
