package dmoj;
import java.io.*;
import java.util.*;

public class DMOPC18_Contest1_P1_Sorting {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(in.readLine().trim());
        String[] line = in.readLine().trim().split(" ");
        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(line[i]);
        }
        boolean zero = false;
        for(int i = 1; i < n; i++) {
            if(list[i] == 0) {
                if (zero) {
                    if(list[i-1] != 0){
                        out.write("NO");
                        break;
                    }
                }
                else {
                    zero = true;
                }
            }
            else {
                if(list[i] < list[i-1] && list[i] != 0) {
                    out.write("NO");
                    break;
                }
            }
            if(i == n - 1)
                out.write("YES");
        }

        out.close();
    }
}
