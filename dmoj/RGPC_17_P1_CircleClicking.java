package dmoj;

import java.util.Scanner;

public class RGPC_17_P1_CircleClicking {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//total number of circles in sequence
        int D = in.nextInt();//greatest jump distance

        int x1=in.nextInt();
        int y1=in.nextInt();
        int longestCombo =1;
        int[] longestComboA = new int[N];
        longestComboA[0] = longestCombo;
        for (int i =0; i<N-1;i++)
        {

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

            if (D>= distance)
            {
                longestCombo++;
                longestComboA[i+1] = longestCombo;
            }

            else
            {
                longestCombo = 0;
                longestComboA[i+1] = longestCombo;
            }

            x1 = x2;
            y1 = y2;
        }

        int maxCombo = longestComboA[0];
        for (int i=1;i<longestComboA.length;i++)
        {
            if (longestComboA[i]>maxCombo)
                maxCombo = longestComboA[i];
        }
        System.out.println(maxCombo);


    }
}
