package hackerrank.strings;

import java.util.*;
import java.io.*;
import java.math.*;
public class CamelCase {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = in.readLine().trim();
        int words = 1;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                words++;
        }

        out.write(String.valueOf(words));

        out.close();
    }
}
