package Exec.반복;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pw = "1234";
        String input_pw =  "";

        do{
            System.out.println("비밀번호를 입력하세요 : ");
            input_pw = sc.nextLine();

        }while(!pw.equals(input_pw));

        System.out.println("정답입니다");
    }
}
