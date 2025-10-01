package Exec.반복;

public class Question11 {
    public static void main(String[] args) {

        for (int i = 4; i >= 0; i--)
        {
            for (int j = 5 - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
