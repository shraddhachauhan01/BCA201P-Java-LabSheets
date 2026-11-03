class Matrix {
    int[][] values;
    static String matrixType = "2x2 Matrix";

    Matrix(int[][] values) {
        this.values = values;
    }

    void addAndSubtract(Matrix other) {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = values[i][j] + other.values[i][j];
                difference[i][j] = values[i][j] - other.values[i][j];
            }
        }

        System.out.println(matrixType + " addition:");
        display(sum);
        System.out.println(matrixType + " subtraction:");
        display(difference);
    }

    void display(int[][] result) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q26 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix m2 = new Matrix(new int[][]{{5, 6}, {7, 8}});
        m1.addAndSubtract(m2);
    }
}
