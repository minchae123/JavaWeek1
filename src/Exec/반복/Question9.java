package Exec.반복;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;

        do {
            age = sc.nextInt();
        }while(age < 0);

        System.out.println("나이 : " + age);
    }
}
