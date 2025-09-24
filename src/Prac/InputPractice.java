package Prac;

import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int n1 =  sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int n2 = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        char ch = sc.next().charAt(0);

        System.out.println("결과: "+ n1 + " " + ch + " "+ n2 );
    }
}
