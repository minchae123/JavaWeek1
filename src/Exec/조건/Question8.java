package Exec.조건;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float cm =  input.nextFloat();
        float kg =  input.nextFloat();
        cm = cm / 100;

        float bmi = kg / (cm*cm);
        System.out.println("b = " + bmi);
        if(bmi >= 30)
            System.out.println("비만");
        else if(bmi >= 25 && bmi <= 29.9)
            System.out.println("과체중");
        else if(bmi >= 18.5 && bmi <= 24.9)
            System.out.println("정상");
        else
            System.out.println("저체중");

    }
}
