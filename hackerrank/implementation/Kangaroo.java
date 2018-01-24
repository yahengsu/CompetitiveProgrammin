package hackerrank.implementation;

import java.util.*;
import java.io.*;
import java.math.*;


public class Kangaroo {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        String[] aLine = in.readLine().split(" ");
        int[] a = new int[n];
        String[] bLine = in.readLine().split(" ");
        int[] b = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(aLine[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(bLine[i]);
        }

        ArrayList<Integer> compare = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((j == n-1) && (a[i]%a[j] == 0)){
                    compare.add(i);
                }
                if(a[i]%a[j] != 0){
                    break;
                }
            }
        }

        int size  = compare.size();
        int count = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < m; j++){
                if((j == n-1) && (compare.get(i)%b[j] == 0)){
                   count++;
                }
                if(compare.get(i)%b[j] != 0){
                    break;
                }
            }
        }

        out.write(String.valueOf(count));

        out.close();
    }
}
