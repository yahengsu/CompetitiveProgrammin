package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;

public class AppleAndOrange {
    public static void main(String[] args) throws IOException{
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apples = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apples[apple_i] = in.nextInt();
        }
        int[] oranges = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            oranges[orange_i] = in.nextInt();
        }

        int apple = 0;
        int orange = 0;

        for(int i = 0; i< m ; i++){
            if((a+apples[i]) >= s &&(a+apples[i]) <= t)
                apple++;
        }
        for(int i = 0; i < n; i++){
            if((b+oranges[i]) >= s &&(b+oranges[i]) <= t)
                orange++;
        }
        out.write(String.valueOf(apple));
        out.newLine();
        out.write(String.valueOf(orange));
        out.newLine();

        out.close();
    }
}
