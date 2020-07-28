package dmoj;

import java.io.*;
import java.util.*;

public class CCC_13_J2_RotatingLetters {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = in.readLine().split("");

        int count = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i].equalsIgnoreCase("I") || line[i].equalsIgnoreCase("O") ||
                    line[i].equalsIgnoreCase("S") || line[i].equalsIgnoreCase("H") ||
                    line[i].equalsIgnoreCase("Z") || line[i].equalsIgnoreCase("X") ||
                    line[i].equalsIgnoreCase("N"))
                count++;
        }

        if (count==line.length)
            out.write("YES");
        else
            out.write("NO");


        out.close();

    }
}
