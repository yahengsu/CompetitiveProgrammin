package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;
public class MigratoryBirds {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine().trim());
        String[] line = in.readLine().split(" ");
        int[] types = new int[5];
        for(int i = 0; i < 5; i++){
            types[i] = 0;
        }
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(line[i]);
            types[temp-1]++;
        }
        int max = 0;

        for(int i = 0; i < 5; i++){
            if(types[i] > max)
                max = types[i];
        }
        int output = 0;

        for(int i = 0; i < 5; i++){
            if (types[i] == max){
                output = i;
                break;
            }

        }


        out.write(String.valueOf(output+1));

        out.close();
    }
}
