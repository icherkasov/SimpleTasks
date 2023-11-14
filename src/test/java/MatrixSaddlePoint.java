import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MatrixSaddlePoint {
//    Saddle point in matrix is element that is smallest in row but biggest in column
//    Matrix can have many or no saddle points

    @Test
    public void checkSaddlePoint() {
        int[][] matrix = getMatrix();
        List<String> saddles = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int smallestInRow = matrix[row][0];
            int columnOfSmallest = 0;
            int rowOfTheSmallest = 0;
            boolean saddleFound = true;
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] < smallestInRow) {
                    smallestInRow = matrix[row][col];
                    columnOfSmallest = col;
                    rowOfTheSmallest = row;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][columnOfSmallest] > smallestInRow) {
                    saddleFound = false;
                    break;
                }
            }
            if (saddleFound) {
                saddles.add(smallestInRow + " coordinates: ["+rowOfTheSmallest+"]["+columnOfSmallest+"]");
            }
        }
        System.out.println(saddles);
    }

    public int[][] getMatrix() {
        int[][] matrix = {
                {6, 3, 1},
                {9, 7, 8},
                {2, 4, 5}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                System.out.print(matrix[i][i1] + " ");
            }
            System.out.println();
        }
        return matrix;

    }


}
