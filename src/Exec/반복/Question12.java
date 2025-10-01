package Exec.반복;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        boolean isPrime = false;

        while(i <= (n / 2))
        {
            if(n % i == 0){
                System.out.println("소수가 아닙니다");
                break;
            }
            i++;
        }

        System.out.println("소수입니다");
    }
}
