package dmoj;

import java.util.HashMap;
import java.util.Scanner;

public class CCC_06_S2_AttackOfTheCipherTexts {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String plaintext = in.nextLine();
        String ciphertext = in.nextLine();
        String ciphertextToSolve = in.nextLine();
        String solved = "";

        HashMap<String,String> cipher = new HashMap<>();

        for (int i = 0; i < plaintext.length(); i++) {
            cipher.put(Character.toString(ciphertext.charAt(i)),Character.toString(plaintext.charAt(i)));

        }
        for (int i = 0; i < ciphertextToSolve.length(); i++) {
            if (!cipher.containsKey(Character.toString(ciphertextToSolve.charAt(i))))
            {
                solved +=".";
            }
            else
            {
                solved += cipher.get(Character.toString(ciphertextToSolve.charAt(i)));

            }
        }

        System.out.println(solved);

    }
}
