package dmoj;
import java.io.*;
import java.util.*;

public class DMOPC18_Contest1_P2_Sorting {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = in.readLine().trim().split(" ");
        String[] secondLine = in.readLine().trim().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(secondLine[i]);
        }

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[j] < a[j-1])
                    break;
                else if(a[j] > a[j-1]) {
                    if(j == n - 1) {
                        out.write("YES");
                        break outer;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                if (j + k <= n - 1) {
                    if(a[j] > a[j+k]){
                        int temp = a[j];
                        a[j] = a[j+k];
                        a[j+k] = temp;
                    }
                }
            }
            if(i == n - 1) {
                for (int j = 1; j < n; j++) {
                    if (a[j] < a[j-1]){
                        out.write("NO");
                        break outer;
                    }
                    else if(a[j] > a[j-1]) {
                        if(j == n - 1) {
                            out.write("YES");
                            break outer;
                        }

                    }
                }
            }
        }

        out.close();
    }
}
