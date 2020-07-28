package dmoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] NInput = in.readLine().split(" ");

        int N = Integer.parseInt(NInput[0]);

        for (int i=0;i<N;i++)
        {
            String[] subsequentLines = in.readLine().split(" ");

            int x1 = Integer.parseInt(subsequentLines[0]);
            int x2 = Integer.parseInt(subsequentLines[1]);

            System.out.println(x1+x2);
        }

    }
}
