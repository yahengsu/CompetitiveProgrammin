package dmoj;

import java.io.*;
import java.util.*;

public class CCC_12_J1_SpeedFines {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(in.readLine().trim());
        int speed = Integer.parseInt(in.readLine().trim());

        if (speed<=limit)
            out.write("Congratulations, you are within the speed limit!");
        else if (limit<speed)
        {
            int F=0;
            if (speed-limit<=20)
                F=100;
            else if (speed-limit>20 && speed-limit<=30)
                F=270;
            else if (speed-limit>30)
                F=500;
            out.write("You are speeding and your fine is $" +F +".");
        }

        out.close();


    }
}
