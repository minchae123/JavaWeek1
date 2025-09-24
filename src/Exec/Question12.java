package Exec;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 4; i++)
        {
            int score = input.nextInt();

            if(score >= 90)
                System.out.println("A");
            else if(score >= 80)
                System.out.println("B");
            else if(score >= 70)
                System.out.println("C");
            else if(score >= 60)
                System.out.println("D");
            else
                System.out.println("F");

            sum += score;
        }

        if(sum / 4 >= 60)
            System.out.println("합격");
        else
            System.out.println("불합격");
    }
}
