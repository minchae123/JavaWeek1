package Exec;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int number =  input.nextInt();

        if(number % 2 == 0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
    }
}
