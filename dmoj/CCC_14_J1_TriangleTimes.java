package dmoj;

import java.io.*;
import java.util.*;

public class CCC_14_J1_TriangleTimes {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int x1 = Integer.parseInt(in.readLine().trim());
        int x2 = Integer.parseInt(in.readLine().trim());
        int x3 = Integer.parseInt(in.readLine().trim());


        if (x1+x2+x3 == 180)
        {
            if (x1 == 60 && x2 == 60 && x3 == 60)
                out.write("Equilateral");
            else if (x1 == x2 || x1 == x3 || x2 == x3)
                out.write("Isosceles");
            else
                out.write("Scalene");
        }
        else
            out.write("Error");


        out.close();

    }
}
