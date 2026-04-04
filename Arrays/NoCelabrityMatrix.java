package Arrays;

public class NoCelabrityMatrix {

    public static void noCelabrityMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int countOnce = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    countOnce++;
            }
            if (countOnce == 0)
                System.out.println("No Celabrity in row number: " + (i + 1));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 0, 0, 0 }, { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 } };
        // No Celabrity Matrix in the sense need to be return the rows with 0 1s;
        noCelabrityMatrix(matrix); // No Celabrity in the rows 1 and 4;
    }
}