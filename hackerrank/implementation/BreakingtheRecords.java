package hackerrank.implementation;
import java.util.*;
import java.io.*;
import java.math.*;


public class BreakingtheRecords {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine().trim());
        String[] secondLine = in.readLine().split(" ");
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(secondLine[i]);
        }
        int lowest = a[0];
        int highest = a[0];
        int lowCount = 0;
        int highCount = 0;

        for(int i = 1; i < n; i++){
            int score = a[i];
            if (score<lowest){
                lowest = score;
                lowCount++;
            }
            if(score>highest){
                highest = score;
                highCount++;
            }
        }

        out.write(String.valueOf(highCount) + " " + String.valueOf(lowCount));


        out.close();
    }


}
