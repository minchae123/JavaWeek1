package Exec.반복;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내 풀이
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int divisor = 1;

        int i = 1;
        while(i < Math.min(n1,n2)){
            if(n1 % i == 0 && n2 % i == 0){
                divisor = i;
            }
            i++;
        }

        System.out.print(divisor);

        // 다른 풀이
        System.out.println("1번 숫자 입력 :");
        int a =  sc.nextInt();
        System.out.println("2번 숫자 입력 :");
        int b =  sc.nextInt();

        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        System.out.println("최대공약수는 " + a);

    }
}
