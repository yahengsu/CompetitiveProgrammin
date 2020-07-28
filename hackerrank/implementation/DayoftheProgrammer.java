package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class DayoftheProgrammer {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(in.readLine().trim());
        if(year < 1918){
            if(year%4 == 0){
                out.write("12.09." + String.valueOf(year));
            }
            else{
                out.write(String.valueOf("13.09.") + String.valueOf(year));
            }
        }
        if(year == 1918){
            out.write("26.09." + String.valueOf(year));
        }
        if(year > 1918){
            if (year%400 == 0 || (year%4 == 0 && year%100 != 0)){
                out.write("12.09." + String.valueOf(year));
            }
            else{
                out.write("13.09." + String.valueOf(year));
            }
        }



        out.close();
    }
}
