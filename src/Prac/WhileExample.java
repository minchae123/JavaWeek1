package Prac;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        i = 6;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
