package dmoj;

import java.util.Scanner;

public class CCC_11_S2_MultipleChoice {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numberLines = in.nextInt();

        String[] studentAnswer = new String[numberLines];
        String[] answer = new String[numberLines];
        int correctAnswers = 0;

        for (int i =0; i<numberLines; i++)
        {
            studentAnswer[i] = in.next();
        }
        for (int i =0; i<numberLines;i++)
        {
            answer[i] = in.next();
        }
        for (int i = 0; i<numberLines; i++)
        {
            if (studentAnswer[i].equals(answer[i]))
            {
                correctAnswers++;
            }
            else if (!studentAnswer[i].equals(answer[i]))
            {

            }
        }


        System.out.println(correctAnswers);
    }
}
