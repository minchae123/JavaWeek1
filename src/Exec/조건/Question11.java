package Exec.조건;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if(n1 > n2)
        {
            max = n1;
            if(max < n3)
                max = n3;
        }
        else
        {
            max = n2;
            if(max < n3)
                max = n3;
        }

        System.out.println("max = " + max);
    }
}
