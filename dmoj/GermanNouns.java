package dmoj;

import java.io.*;
import java.util.*;

public class GermanNouns {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine().trim());
        String[] capitals = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        for (int i = 0; i < N; i++) {
            String[] line = in.readLine().split(" ");
            int count =0;
            for (int j = 0; j < line.length; j++) {
                for (int k = 0; k < capitals.length; k++) {
                    if (line[j].startsWith(capitals[k]))
                        count++;
                }
            }

            out.write(String.valueOf(count));
            out.newLine();
        }



        out.close();
    }
}
