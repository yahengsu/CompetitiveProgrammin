package dmoj;

import java.io.*;
import java.util.*;

public class CCC_08_J1_BodyMassIndex {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int weight = Integer.parseInt(in.readLine().trim());
        double height = Double.parseDouble(in.readLine().trim());
        double bmi = weight/(height*height);
        if (bmi>25)
            out.write("Overweight");
        else if (bmi<= 25 && bmi >= 18.5)
            out.write("Normal weight");
        else if (bmi<18.5)
            out.write("Underweight");



        out.close();
    }
}
