package Exec.반복;

public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i <= 100){
            if(i % 2==0)
                sum +=i;
            i++;
        }


        System.out.println(sum);
    }
}
