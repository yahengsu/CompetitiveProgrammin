package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;
public class SockMerchant {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine().trim());
        String[] secondLine = in.readLine().split(" ");
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(secondLine[i]);
        }
        int[] indices = new int[101];
        for(int i = 0; i < 100; i++){
            indices[i] = 0;
        }
        int pairs = 0;

        for(int i = 0; i < n; i++){
            indices[a[i]]++;
        }

        for(int i = 0; i < 100; i++){
            if(indices[i]>=2 ){
                if(indices[i]%2==0){
                    pairs += indices[i]/2;
                }
                else if(indices[i]%2 == 1){
                    while(indices[i]>=2){
                        pairs++;
                        indices[i] -=2;
                    }
                }
            }
        }


        out.write(String.valueOf(pairs));

        out.close();
    }
}
