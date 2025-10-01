package Exec.반복;

public class Question5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            else
                continue;
        }
    }
}
