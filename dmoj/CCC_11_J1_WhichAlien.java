package dmoj;

import java.io.*;
import java.util.*;

public class CCC_11_J1_WhichAlien {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int antenna = Integer.parseInt(in.readLine().trim());
        int eyes = Integer.parseInt(in.readLine().trim());

        if (antenna>=3 && eyes<=4)
        {
            out.write("TroyMartian");
            out.newLine();
        }
        if (antenna<=6 && eyes>=2)
        {
            out.write("VladSaturnian");
            out.newLine();
        }
        if (antenna<=2 && eyes<=3)
        {
            out.write("GraemeMercurian");
            out.newLine();
        }

        out.close();
    }
}
