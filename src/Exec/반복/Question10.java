package Exec.반복;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int sum = 0;

        for(int i=1;i<n;i++){
            sum += i;
            if(i >= 100)
                break;
        }
        System.out.println(sum);
    }
}
