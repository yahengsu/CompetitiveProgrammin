package dmoj;

import java.io.*;
import java.util.*;

public class CCC_06_J1_CanadianCalorieCounting {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int burgerC = Integer.parseInt(in.readLine().trim()) ;
        int sideC = Integer.parseInt(in.readLine().trim()) ;
        int drinkC = Integer.parseInt(in.readLine().trim()) ;
        int dessertC = Integer.parseInt(in.readLine().trim()) ;

        int[] burger = { 461, 431, 420, 0};
        int[] side = {100, 57, 70, 0};
        int[] drink = {130,160,118,0};
        int[] dessert = {167,266,75,0};

        int total=burger[burgerC-1] + side[sideC-1] + drink[drinkC-1] + dessert[dessertC-1];

        out.write("Your total Calorie count is " + String.valueOf(total) + ".");

        out.close();

    }
}
