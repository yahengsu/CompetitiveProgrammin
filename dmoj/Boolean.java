package dmoj;

import java.io.*;
import java.util.*;

public class Boolean {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = in.readLine().split(" ");
        int notCount =0;
        for (int i = 0; i < firstLine.length; i++) {
            if (firstLine[i].equals("not"))
                notCount++;
        }

        if (notCount%2==0 && firstLine[firstLine.length-1].equals("True"))
            out.write("True");
        else if (notCount%2==0 && firstLine[firstLine.length-1].equals("False"))
            out.write("False");
        else if (notCount%2==1 && firstLine[firstLine.length-1].equals("True"))
            out.write("False");
        else if (notCount%2==1 && firstLine[firstLine.length-1].equals("False"))
            out.write("True");

        out.close();

    }
}
