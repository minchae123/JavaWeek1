package Prac;

public class MatrixArray {
    public static void main(String[] args) {
        int[][] numbersArray = new int[5][2];

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            //System.out.println(matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.print(matrix[i][j] + " ");
                System.out.print("i : " + i + " j : " + j + " | " + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
