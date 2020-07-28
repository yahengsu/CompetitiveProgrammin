package dmoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_04_J1_Squares {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] NInput = in.readLine().split(" ");

        int a = Integer.parseInt(NInput[0]);

        if ((int) Math.sqrt(Math.pow(a,2)) == a)
            System.out.println("The largest square has side length " + ((int) Math.sqrt(a)) + ".");
        else
            System.out.println("The largest square has side length " + ((int) Math.sqrt(a) - 1) + ".");

    }
}
