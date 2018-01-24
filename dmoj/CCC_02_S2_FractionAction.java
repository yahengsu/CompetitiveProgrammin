package dmoj;
import java.io.*;
import java.util.*;

public class CCC_02_S2_FractionAction {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int numerator = Integer.parseInt(in.readLine().trim());
        int denominator = Integer.parseInt(in.readLine().trim());

        if (numerator%denominator ==0)
            out.write(String.valueOf(numerator/denominator));
        else if (numerator%denominator !=0)
        {
            int part1 = Math.floorDiv(numerator,denominator);
            int denominator2 = denominator;
            int remainder = numerator-(part1*denominator);


            boolean simplified=false;

            while (!simplified)
            {
                if (denominator2%remainder == 0)
                {
                    denominator2 = denominator2/remainder;
                    remainder = 1;

                }
                if (denominator2%2 == 0 && remainder%2 == 0)
                {
                    denominator2 = denominator2/2;
                    remainder = remainder/2;

                }
                if (denominator2%3 == 0 && remainder%3 == 0)
                {
                    denominator2 = denominator2/3;
                    remainder = remainder/3;

                }
                if (denominator2%5 == 0 && remainder%5 == 0)
                {
                    denominator2 = denominator2/5;
                    remainder = remainder/5;

                }
                if (denominator2%7 == 0 && remainder%7 == 0)
                {
                    denominator2 = denominator2/7;
                    remainder = remainder/7;

                }
                else
                    simplified = true;
            }




            String part2=  remainder + "/" + denominator2;
            if (part1==0)
                out.write(part2);
            else
                out.write(String.valueOf(part1) + " " + part2);
        }



        out.close();
    }
}
