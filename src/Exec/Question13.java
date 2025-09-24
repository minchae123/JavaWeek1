package Exec;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1번 숫자 입력: ");
        int n1 =  input.nextInt();
        System.out.print("+-*/ 중 입력: ");
        char oper = input.next().charAt(0);
        System.out.print("2번 숫자 입력: ");
        int n2 = input.nextInt();
        System.out.print("+-*/ 중 입력: ");
        char oper2 = input.next().charAt(0);
        System.out.print("3번 숫자 입력: ");
        int n3 = input.nextInt();

        double result = 0.0;

        switch (oper) {
            case '*': {
                switch(oper2){
                    case '*': result = n1 * n2 * n3; break;
                    case '/': result = n1 * n2 / n3; break;
                    case '+': result = n1 * n2 + n3; break;
                    case '-': result = n1 * n2 - n3; break;
                }
            }
            case '/' : {
                switch(oper2){
                    case '*': result = n1 / n3 * n2; break;
                    case '/': result = n1 / n2 / n3; break;
                    case '+': result = n1 / n2 - n3; break;
                    case '-': result = n1 / n2 - n3; break;
                }
            }
            case '+' : {
                switch(oper2){
                    case '*': result = n1 + n2 * n3; break;
                    case '/': result = n1 / n2 / n3; break;
                    case '+': result = n1 + n2 + n3; break;
                    case '-': result = n1 - n2 - n3; break;
                }
            }
            case '-': {
                switch(oper2){
                    case '*': result = n1 - n2 * n3; break;
                    case '/': result = n1 - n2 / n3; break;
                    case '+': result = n1 - n2 - n3; break;
                    case '-': result = n1 - n2 - n3; break;
                }
            }
        }

        System.out.println(result);
    }
}
