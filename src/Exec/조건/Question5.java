package Exec.조건;

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age >= 18)
            System.out.println("성인입니다");
        else
            System.out.println("미성년자입니다");
    }
}
