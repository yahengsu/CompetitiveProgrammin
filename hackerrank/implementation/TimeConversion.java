package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class TimeConversion {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = in.readLine().split("");
        if ((line[8]+line[9]).equals("PM") && !(line[0] + line[1]).equals("12")){
            line[0] = String.valueOf(Integer.parseInt(line[0]) + 1);
            line[1] = String.valueOf(Integer.parseInt(line[1]) + 2);

        }
        if((line[8]+line[9]).equals("AM") && (line[0] + line[1]).equals("12")){
            line[0] = "0";
            line[1] = "0";
        }
        for(int i = 0; i< 8; i++){
            out.write(line[i]);
        }

        out.newLine();
        out.close();
    }
}
