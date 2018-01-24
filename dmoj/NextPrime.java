package dmoj;

import java.io.*;
import java.util.*;

public class NextPrime {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(in.readLine().trim());

        boolean found = false;
        while(!found)
        {
            int sqrt = (int) Math.ceil(Math.sqrt(test));
            int count =0;
            for (int i = 1; i <= sqrt; i++) {
                if (test%i==0)
                    count++;
            }
            if (test==1)
            {
                out.write("2");
                found = true;
            }

            else if (test == 2)
            {
                out.write("2");
                found=true;
            }
            else if (count==1)
            {
                out.write(String.valueOf(test));
                found=true;

            }
            else
                test++;
        }

        out.close();


    }
}
