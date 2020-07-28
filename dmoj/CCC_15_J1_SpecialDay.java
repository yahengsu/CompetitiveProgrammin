package dmoj;

import java.io.*;
import java.util.*;

public class CCC_15_J1_SpecialDay {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int month = Integer.parseInt(in.readLine().trim());
        int day = Integer.parseInt(in.readLine().trim());
        if (month<2)
            out.write("Before");
        else if (month>2)
            out.write("After");
        else if (month == 2)
        {
            if (day==18)
                out.write("Special");
            else if (day<18)
                out.write("Before");
            else if (day>18)
                out.write("After");
        }



        out.close();

    }
}
