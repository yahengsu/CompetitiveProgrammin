package dmoj;

import java.util.Scanner;

public class CCC_08_S1_ItsColdHere {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean waterloo = false;
        String maxcity = "";
        int lowestTemp = 200;

        while (!waterloo)
        {
            String city = in.next();
            if (city.equalsIgnoreCase("waterloo"))
            {
                waterloo = true;
            }
            int temperature = in.nextInt();
            if (temperature<lowestTemp)
            {
                lowestTemp = temperature;
                maxcity = city;
            }

        }
        System.out.println(maxcity);
    }
}
